/**
 * @format
 */

import { AppRegistry, YellowBox } from 'react-native';
import App from './App';
import { name as appName } from './app.json';
YellowBox.ignoreWarnings([
  'Warning: componentWillReceiveProps is deprecated',
  'Warning: CheckBox has been extracted from react-native core and will be removed in a future release',
]);

AppRegistry.registerComponent(appName, () => App);
