package msglauncher


class UploadJob {
    static triggers = {
        cron name: 'UploadJob', cronExpression: "0/1 * * * * ?"
    }

    String group = "MyGroup"

    void execute() { println "Job UploadJob: ping! ${new Date()}" } 
}
