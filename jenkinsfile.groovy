node{

    stage ('install the apache'){
        sh "ssh root@172.31.90.67 'sudo yum install httpd -y' "
    }

    stage ('start the apache'){
    sh "ssh root@172.31.90.67 'sudo systemctl start httpd' "
    }


}