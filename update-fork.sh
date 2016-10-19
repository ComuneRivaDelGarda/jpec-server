# DEVELOP -> RIVA TEST
# MASTER -> RIVA PRODUZIONE
# FEATURE/PASSWORD - test feature password
# FEATURE/TOMCAT6 -> MORI PRODUZIONE

git fetch upstream

git merge upstream/develop
git merge upstream/feature/password

git push origin develop
