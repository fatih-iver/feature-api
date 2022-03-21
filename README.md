# Feature-Api

Feature-Api helps us do runtime feature toggling. It is implemented by using Spring & Togglz.

## Run

```bash
mvn spring-boot:run
```

## Toggle Features

Check toggle console at http://localhost:8080/togglz-console/index

## Example Usages

```bash
curl --location --request GET 'http://localhost:8080/is-feature-active?feature=NEW_WEBSITE'

curl --location --request GET 'http://localhost:8080/is-feature-active?feature=NEW_WEBSITE&user=fatih.iver@gmail.com'
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)