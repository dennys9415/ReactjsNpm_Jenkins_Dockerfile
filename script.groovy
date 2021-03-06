def build() {
    sh 'docker build -t dennys9415/jenkinsreact:latest .'
}

def login() {
    sh 'echo $DOCKER_CRED_PSW | docker login -u $DOCKER_CRED_USR --password-stdin'
}


def push() {
    sh 'docker push dennys9415/jenkinsreact:latest'
}


def logout() {
    echo 'Login Out of the Account'
    sh 'docker logout'
}

return this