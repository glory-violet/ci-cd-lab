from app import add, app


def test_add():
    assert add(2, 3) == 5


def test_home_route():
    client = app.test_client()
    response = client.get("/")
    assert response.status_code == 200
    assert b"Hello" in response.data