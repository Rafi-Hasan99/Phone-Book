📱 Phone-Book

Phone-Book is a simple Android application for managing contacts. Users can save contact details (name, phone number, email) and view saved contacts. Clicking on a contact displays its details.
🌟 Features

    Add new contacts with name, phone number, and email.
    View saved contacts in a list.
    Display contact details in a Toast message on click.
    Light ash background with a user-friendly interface.
    Contacts stored in a static list (for demonstration purposes).

🛠️ Technologies Used

    Android Studio
    Java
    XML

🧰 Installation

    Clone this repository:

    git clone https://github.com/your-username/phone-book.git

    Open the project in Android Studio.
    Sync Gradle files.
    Run the app on an emulator or connected device.

📂 Project Structure

src/
├── main/
│   ├── java/com/example/phonebook/
│   │   ├── MainActivity.java
│   │   ├── ContactListActivity.java
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_contact_list.xml
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   ├── strings.xml
│   │   ├── drawable/
│   ├── AndroidManifest.xml

✏️ Usage

    Add a Contact:
        Enter the name, phone number, and email in the provided text fields.
        Click Save Contact to add it to the contact list.

    View Saved Contacts:
        Click View Saved Contacts to open the contact list.
        Tap a contact name to view its details.

🐛 Troubleshooting
Common Issues:

    App Crashes on "View Saved Contacts":
        Ensure you've saved at least one contact before clicking the button.
        Check the Java and XML file paths.

    UI Misalignment:
        Recheck XML layouts for proper configurations.


🤝 Contribution

    Fork the repository.
    Create a feature branch:

git checkout -b feature-name

Commit your changes:

git commit -m "Add feature description"

Push to the branch:

    git push origin feature-name

    Create a Pull Request.

