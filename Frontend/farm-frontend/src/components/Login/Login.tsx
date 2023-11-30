import "./Login.css";
import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Stack from "react-bootstrap/Stack";
import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";

function Login() {
  return (
    <div>
      <Container>
        <Stack gap={3}>
          <div className="p-3"></div>
          <Row>
            <Col></Col>
            <Col xs={3}>
              <h3>
                <center className="form-label">Login</center>
              </h3>
              <div className="p-2"></div>
              <Card>
                <Card.Body>
                  <div className="row mainFormDiv p-2">
                    <form>
                      <div className="mb-3">
                        <label
                          htmlFor="exampleInputEmail1"
                          className="form-label"
                        >
                          Email address
                        </label>
                        <input
                          type="email"
                          className="form-control"
                          id="exampleInputEmail1"
                          aria-describedby="emailHelp"
                        />
                        <div id="emailHelp" className="form-text">
                          Your data is important to us
                        </div>
                      </div>
                      <div className="mb-3">
                        <label
                          htmlFor="exampleInputPassword1"
                          className="form-label"
                        >
                          Password
                        </label>
                        <input
                          type="password"
                          className="form-control"
                          id="exampleInputPassword1"
                        />
                      </div>
                      <div className="mb-3 form-check">
                        <input
                          type="checkbox"
                          className="form-check-input"
                          id="exampleCheck1"
                        />
                        <label
                          className="form-text" /* form-check-label */
                          htmlFor="exampleCheck1"
                        >
                          Click to agree terms and conditions
                        </label>
                      </div>
                      <div className="p-2"></div>
                      <div>
                        <center>
                          <Button
                            type="submit"
                            variant="success"
                            className="btn btn-primary"
                          >
                            Submit
                          </Button>
                        </center>
                      </div>
                    </form>
                  </div>
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

export default Login;
