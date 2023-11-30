import React from "react";

interface SprinklerProps {
  sprinkler: {
    sprinklerId: number;
    farmId: number;
    zone: number;
    state: boolean;
  };
}

const Sprinkler: React.FC<SprinklerProps> = ({ sprinkler }) => {
  const color = sprinkler.state ? "#89CFF0" : "green";

  return (
    <div
      style={{
        width: "50px",
        height: "50px",
        backgroundColor: color,
        margin: "5px",
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        border: "1px solid #ccc",
        borderRadius: "5px",
        fontWeight: "bold",
      }}
    >
      <div>
        <div>Zone: {sprinkler.zone}</div>
      </div>
    </div>
  );
};

export default Sprinkler;
