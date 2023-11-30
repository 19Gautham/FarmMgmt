import React, { useState, useEffect } from "react";
import Sprinkler from "./Sprinkler";

interface SprinklerData {
  sprinklerId: number;
  farmId: number;
  zone: number;
  state: boolean;
}

interface MoistureSensorData {
  sensorId: number;
  farmId: number;
  zone: number;
  reading: number;
}

const SprinklerMonitor: React.FC = () => {
  const [sprinklers, setSprinklers] = useState<SprinklerData[]>([]);
  const [moistureSensors, setMoistureSensors] = useState<MoistureSensorData[]>(
    []
  );

  useEffect(() => {
    const fetchSprinklerData = async () => {
      try {
        const response = await fetch(
          "http://localhost:8080/rest/getSprinklers?farmId=7"
        );
        const data: SprinklerData[] = await response.json();
        setSprinklers(data);
      } catch (error) {
        console.error("Error fetching sprinkler data:", error);
      }
    };

    const fetchMoistureSensorData = async () => {
      try {
        const response = await fetch(
          "http://localhost:8080/rest/getSoilMoistureSensors?farmId=7"
        ); // Update the endpoint accordingly
        const data: MoistureSensorData[] = await response.json();
        setMoistureSensors(data);
      } catch (error) {
        console.error("Error fetching moisture sensor data:", error);
      }
    };

    const intervalId = setInterval(() => {
      fetchSprinklerData();
      fetchMoistureSensorData();
    }, 2000);

    return () => clearInterval(intervalId);
  }, []);

  const combinedData = sprinklers.map((sprinkler) => ({
    ...sprinkler,
    moistureSensor: moistureSensors.find(
      (sensor) => sensor.zone === sprinkler.zone
    ),
  }));

  console.log(moistureSensors);
  

  return (
    <div
      style={{ textAlign: "center", background: "#f5f5f5", padding: "20px" }}
    >
      <h1 style={{ color: "#333", marginBottom: "20px" }}>
        Sprinkler and Moisture Sensor Status
      </h1>
      <div
        style={{ display: "flex", flexWrap: "wrap", justifyContent: "center" }}
      >
        {combinedData.map((data) => (
          <div key={data.sprinklerId} style={{ margin: "10px" }}>
            <Sprinkler sprinkler={data} />
            <div style={{ marginTop: "10px" }}>
              <strong>Moisture Level:</strong>{" "}
              {data.moistureSensor?.reading ?? "N/A"}
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default SprinklerMonitor;
