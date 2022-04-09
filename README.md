[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE.md)

# Jenkins with python

> Represents Jenkins server containerisation with pre-built python.

## Tools

- docker >= 18.0
- docker-compose >= 1.29.2
- k8s >= 1.21.1

## Usage

TBD

### Source code

```bash
git clone git@github.com:vyahello/jenkins-python.git
cd jenkins-python
docker-compose up
```

Then please open http://localhost:8080 in your browser.

**[⬆ back to top](#jenkins-with-python)**

## Development notes

### Release image 

#### Base Jenkins image

```bash
docker build --no-cache --tag vyahello/jenkins-python-base:0.1.0 --file Dockerfile-base .
docker push jenkins-python-base:0.1.0
```

#### Python Jenkins image

```bash
docker build --no-cache --tag vyahello/jenkins-python:3.7 --file Dockerfile-python3.7 .
docker run -it --rm vyahello/jenkins-python:3.7 python -V
docker push vyahello/jenkins-python:3.7
```

### Meta

Author – _Vladimir Yahello_.

Distributed under the `MIT` license. See [license](LICENSE.md) for more information.

You can reach out me at:
* [vyahello@gmail.com](vyahello@gmail.com)
* [https://twitter.com/vyahello](https://twitter.com/vyahello)
* [https://www.linkedin.com/in/volodymyr-yahello-821746127](https://www.linkedin.com/in/volodymyr-yahello-821746127)

### Contributing

1. Clone the repository
2. Configure `git` for the first time after cloning with your `name` and `email`
3. Create your feature branch (git checkout -b feature/fooBar)
4. Commit your changes (git commit -am 'Add some fooBar')
5. Push to the branch (git push origin feature/fooBar)
6. Create a new Pull Request

**[⬆ back to top](#jenkins-with-python)**
