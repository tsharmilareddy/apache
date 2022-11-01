node{

    stage ('install the apache'){
        sh "ssh ec2-user@10.0.0.199 'sudo yum install httpd -y' "
    }

    stage ('start the apache'){
    sh "ssh ec2-user@10.0.0.199 'sudo systemctl start httpd' "
    }

    stage ('enable the apache'){
        sh "ssh ec2-user@10.0.0.199 'sudo systemctl enable httpd'"
    }
}