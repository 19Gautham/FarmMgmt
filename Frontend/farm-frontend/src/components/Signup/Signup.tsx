import Button from "react-bootstrap/Button";
import Col from "react-bootstrap/Col";
import Form from "react-bootstrap/Form";
import Row from "react-bootstrap/Row";
import Container from "react-bootstrap/Container";
import Stack from "react-bootstrap/Stack";
import Card from "react-bootstrap/Card";

function SignUp() {
  return (
    <div>
      <Container>
        <Stack gap={3}>
          <div className="p-3"></div>
          <Row>
            <Col></Col>
            <Col xs={5}>
              <h3>
                <center className="form-label link-success">Sign Up!</center>
              </h3>
              <div className="p-2"></div>
              <Card>
                <Card.Body>
                  <Form>
                    <Row className="mb-3">
                      <Form.Group as={Col} controlId="formGridEmail">
                        <Form.Label>Email</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                      </Form.Group>

                      <Form.Group as={Col} controlId="formGridPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                      </Form.Group>
                      <div id="emailHelp" className="form-text">
                        We'll never share your data with anyone else
                      </div>
                    </Row>

                    <Form.Group className="mb-3" controlId="formGridAddress1">
                      <Form.Label>Address 1</Form.Label>
                      <Form.Control placeholder="Street name" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formGridAddress2">
                      <Form.Label>Address 2</Form.Label>
                      <Form.Control placeholder="Apartment, studio, or floor" />
                    </Form.Group>

                    <Row className="mb-3">
                      <Form.Group as={Col} controlId="formGridCity">
                        <Form.Label>City</Form.Label>
                        <Form.Control />
                      </Form.Group>

                      <Form.Group as={Col} controlId="formGridState">
                        <Form.Label>State</Form.Label>
                        <Form.Select defaultValue="Choose...">
                          <option>Choose...</option>
                          <option>Arizona</option>
                          <option>California</option>
                          <option>Texas</option>
                          <option>Nevada</option>
                        </Form.Select>
                      </Form.Group>

                      <Form.Group as={Col} controlId="formGridZip">
                        <Form.Label>Zip</Form.Label>
                        <Form.Control />
                      </Form.Group>
                    </Row>
                    <div className="p-2"></div>
                    <div>
                      <center>
                        <Button variant="primary" size="lg" type="submit">
                          Submit
                        </Button>
                      </center>
                    </div>
                  </Form>
                </Card.Body>
              </Card>
            </Col>
            <Col></Col>
          </Row>
          <div className="p-5"></div>
        </Stack>
      </Container>
    </div>
  );
}

export default SignUp;
