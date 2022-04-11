![Screenshot](logo.png)

[![Docker pulls](https://img.shields.io/docker/pulls/vyahello/jenkins-python.svg)](https://hub.docker.com/repository/docker/vyahello/jenkins-python)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE.md)

# Jenkins with python

> Represents Jenkins server containerisation with pre-built python.

## Tools

- docker >= 18.0
- docker-compose >= 1.29.2
- k8s >= 1.21.1

## Docker images 

- [vyahello/jenkins-python:3.6](https://hub.docker.com/layers/202247078/vyahello/jenkins-python/3.6/images/sha256-890a7936c4bd7c1fcd8dbc5899410f04f6080f88701bdd84fb06a5a1da112aaf?context=repo)
- [vyahello/jenkins-python:3.7](https://hub.docker.com/layers/jenkins-python/vyahello/jenkins-python/3.7/images/sha256-3299c5c817690a91f3ce2fc81f4e8281bbe61bc63c2c869b5544303832d5e64a?context=repo)
- [vyahello/jenkins-python:3.8](https://hub.docker.com/layers/jenkins-python/vyahello/jenkins-python/3.8/images/sha256-016efc8c313cb309a8e3ba87891f20e0d747009168ef274f64429806e2cc7c15?context=repo)
- [vyahello/jenkins-python:3.9](https://hub.docker.com/layers/jenkins-python/vyahello/jenkins-python/3.9/images/sha256-9e1d533be65f02dc69ad3260011a9abe1e960ff66981a3b712da0136c0b31b82?context=repo)
- [vyahello/jenkins-python:3.10](https://hub.docker.com/layers/202221477/vyahello/jenkins-python/3.10/images/sha256-f4f4c080e3ed4fbfb86f5ed62eeef9084f32145fcb30a74112e9a6cf66562043?context=repo)

## Usage

### Docker

```bash
git clone git@github.com:vyahello/jenkins-python.git
cd jenkins-python/docker
docker-compose up
```

Then please open http://localhost:8080 in your browser.

> Note: all Jenkins server files will be stored in `jenkins_home` folder in current working directory.

### K8S 

```bash
kubectl apply -f k8s/deployment.yaml
```

Then please open http://localhost:8080 in your browser. It will create 2 Jenkins replicas.

**[⬆ back to top](#jenkins-with-python)**

## Development notes

### Release image 

#### Base Jenkins image

```bash
cd docker
docker build --no-cache --tag vyahello/jenkins-base:0.1.0 --file Dockerfile-base .
docker push jenkins-base:0.1.0
```

#### Python Jenkins image

```bash
cd docker
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
