import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Container from "react-bootstrap/Container";
import Stack from "react-bootstrap/Stack";

function About() {
  return (
    <>
      <Container>
        <Stack gap={3}>
          <div className="p-3"></div>
          <Row>
            <Col></Col>
            <Col xs={9}>
              <h3>Introducing AgriSage – Cultivating Tomorrow's Harvest</h3>
              <div className="p-3"></div>
              <p>
                🌱 AgriSage, a revolutionary smart farming solution, redefines
                agricultural practices by seamlessly merging cutting-edge
                technology with the age-old art of cultivation. Our mission is
                to empower farmers with intelligent, automated irrigation and
                weather-responsive crop protection.
              </p>
              <div className="p-2"></div>
              <p>
                💡 Imagine a world where every drop of water is optimally
                utilized, where crops are shielded from extreme weather events
                with precision, and where sustainable farming is not just a goal
                but a reality. AgriSage makes this vision tangible.
              </p>
              <div className="p-2"></div>
              <p>
                🚀 With real-time data analytics, intuitive interfaces, and
                robust automation, AgriSage stands at the forefront of the
                agricultural evolution. Join us in transforming the future of
                farming – one smart irrigation at a time. Cultivate innovation,
                nurture sustainability. AgriSage - Your Field, Our Wisdom.
              </p>
            </Col>
            <Col></Col>
          </Row>
          <div className="p-5"></div>
        </Stack>
      </Container>
    </>
  );
}

export default About;
