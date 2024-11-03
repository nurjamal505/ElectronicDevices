# Electronic Device Management Application

This project is a JavaFX-based application that models different types of electronic devices using object-oriented programming (OOP) principles. It includes a base `Device` class and three derived classes (`Smartphone`, `Laptop`, and `Tablet`). The application allows users to add, view, and remove devices through a simple GUI.

## Project Features

- **Device Types**: Models three types of devices - `Smartphone`, `Laptop`, and `Tablet`.
- **Attributes**: Each device type has specific attributes, such as screen size for smartphones, RAM size for laptops, and battery life for tablets.
- **JavaFX GUI**: A graphical user interface to input device details, add devices to a list, view device information, and remove devices.

### Classes Overview

- **Device**: Base class representing a generic device. Includes common attributes (`name`, `price`, `weight`).
- **Smartphone**: Inherits from `Device`. Adds specific attributes - `screenSize` and `cameraResolution`.
- **Laptop**: Inherits from `Device`. Adds specific attributes - `ramSize` and `processorType`.
- **Tablet**: Inherits from `Device`. Adds specific attributes - `batteryLife` and `hasStylus`.

## GUI Components

1. **TabPane**: Provides three tabs to select the type of device (`Smartphone`, `Laptop`, `Tablet`).
2. **TextFields**: For inputting `name`, `price`, and `weight`, with additional fields based on device type.
3. **Add Button**: Adds the device to the `ListView`.
4. **ListView**: Displays a list of all added devices.
5. **Remove Button**: Removes the selected device from the list.
6. **Labels**: Feedback messages to guide users (e.g., missing fields, device added, device removed).

## Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**.
- **JavaFX SDK** (required if using JDK versions lower than 11).
- **Git** (to clone the repository).

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/nurjamal505/ElectronicDevices
   cd electronic-device-management
   ```

2. Open the project in **IntelliJ IDEA** or any Java IDE supporting JavaFX.

3. Run the application from `HelloApplication.java`.

4. The GUI window should open, allowing you to interact with the device management system.

## Usage Instructions

1. **Select Device Type**: Choose a device type by selecting the corresponding tab.

2. **Enter Device Details**:
   - **Common fields**: Enter `name`, `price`, and `weight`.
   - **Device-specific fields**: Each device type has additional fields, such as `Screen Size` for smartphones.

3. **Add Device**: Click **Add** to add the device to the list. Ensure all required fields are filled.

4. **View Devices**: The `ListView` displays all added devices.

5. **Remove Device**: Select a device from the `ListView` and click **Remove** to delete it from the list.

## Screenshots
![Снимок экрана 2024-11-03 221156](https://github.com/user-attachments/assets/7706f06f-edba-46be-9778-54a10ecda4cc)


## Example Inputs

1. **Smartphone**:
   - Name: Galaxy S
   - Price: 799.99
   - Weight: 174.0
   - Screen Size: 6.1
   - Camera Resolution: 12.0
   ![Снимок экрана 2024-11-03 221834](https://github.com/user-attachments/assets/95318b83-7e13-453a-ad24-c0483e6772ee)

2. **Laptop**:
   - Name: Dell XPS 
   - Price: 1499.99
   - Weight: 1800.0
   - RAM Size: 16
   - Processor Type: Intel i7
   ![Снимок экрана 2024-11-03 222004](https://github.com/user-attachments/assets/b1dbb4cf-cb1b-4ab6-84c4-23cdd87f4f81)

3. **Tablet**:
   - Name: iPad Pro
   - Price: 1099.99
   - Weight: 468.0
   - Battery Life: 10.0
   - Has Stylus: Yes
  ![Снимок экрана 2024-11-03 222127](https://github.com/user-attachments/assets/816bfd73-2ca0-499a-98be-70a8c092d965)

## Evaluation Criteria

- **OOP Principles**: Correct implementation of inheritance and encapsulation in the `Device` class and its subclasses.
- **GUI Functionality**: A fully operational JavaFX interface for adding, viewing, and removing devices.
- **Code Quality**: Adherence to best practices, clear comments, and proper naming conventions.
- **Completeness**: Ensuring the GitHub link, README file, and UI samples are submitted.

## Author and License

This project is licensed under the MIT License.
