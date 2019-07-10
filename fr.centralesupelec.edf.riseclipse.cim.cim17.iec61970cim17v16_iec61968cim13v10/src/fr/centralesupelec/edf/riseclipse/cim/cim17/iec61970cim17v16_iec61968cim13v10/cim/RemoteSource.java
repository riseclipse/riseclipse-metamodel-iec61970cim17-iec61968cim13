/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getScanInterval <em>Scan Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource()
 * @model
 * @generated
 */
public interface RemoteSource extends RemotePoint {
    /**
     * Returns the value of the '<em><b>Deadband</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deadband</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deadband</em>' attribute.
     * @see #isSetDeadband()
     * @see #unsetDeadband()
     * @see #setDeadband(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource_Deadband()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteSource.deadband' kind='element'"
     * @generated
     */
    Float getDeadband();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getDeadband <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deadband</em>' attribute.
     * @see #isSetDeadband()
     * @see #unsetDeadband()
     * @see #getDeadband()
     * @generated
     */
    void setDeadband( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getDeadband <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeadband()
     * @see #getDeadband()
     * @see #setDeadband(Float)
     * @generated
     */
    void unsetDeadband();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getDeadband <em>Deadband</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Deadband</em>' attribute is set.
     * @see #unsetDeadband()
     * @see #getDeadband()
     * @see #setDeadband(Float)
     * @generated
     */
    boolean isSetDeadband();

    /**
     * Returns the value of the '<em><b>Scan Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scan Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scan Interval</em>' attribute.
     * @see #isSetScanInterval()
     * @see #unsetScanInterval()
     * @see #setScanInterval(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource_ScanInterval()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteSource.scanInterval' kind='element'"
     * @generated
     */
    Float getScanInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scan Interval</em>' attribute.
     * @see #isSetScanInterval()
     * @see #unsetScanInterval()
     * @see #getScanInterval()
     * @generated
     */
    void setScanInterval( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScanInterval()
     * @see #getScanInterval()
     * @see #setScanInterval(Float)
     * @generated
     */
    void unsetScanInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scan Interval</em>' attribute is set.
     * @see #unsetScanInterval()
     * @see #getScanInterval()
     * @see #setScanInterval(Float)
     * @generated
     */
    boolean isSetScanInterval();

    /**
     * Returns the value of the '<em><b>Sensor Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensor Maximum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sensor Maximum</em>' attribute.
     * @see #isSetSensorMaximum()
     * @see #unsetSensorMaximum()
     * @see #setSensorMaximum(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource_SensorMaximum()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteSource.sensorMaximum' kind='element'"
     * @generated
     */
    Float getSensorMaximum();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sensor Maximum</em>' attribute.
     * @see #isSetSensorMaximum()
     * @see #unsetSensorMaximum()
     * @see #getSensorMaximum()
     * @generated
     */
    void setSensorMaximum( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSensorMaximum()
     * @see #getSensorMaximum()
     * @see #setSensorMaximum(Float)
     * @generated
     */
    void unsetSensorMaximum();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sensor Maximum</em>' attribute is set.
     * @see #unsetSensorMaximum()
     * @see #getSensorMaximum()
     * @see #setSensorMaximum(Float)
     * @generated
     */
    boolean isSetSensorMaximum();

    /**
     * Returns the value of the '<em><b>Sensor Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensor Minimum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sensor Minimum</em>' attribute.
     * @see #isSetSensorMinimum()
     * @see #unsetSensorMinimum()
     * @see #setSensorMinimum(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource_SensorMinimum()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteSource.sensorMinimum' kind='element'"
     * @generated
     */
    Float getSensorMinimum();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sensor Minimum</em>' attribute.
     * @see #isSetSensorMinimum()
     * @see #unsetSensorMinimum()
     * @see #getSensorMinimum()
     * @generated
     */
    void setSensorMinimum( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSensorMinimum()
     * @see #getSensorMinimum()
     * @see #setSensorMinimum(Float)
     * @generated
     */
    void unsetSensorMinimum();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sensor Minimum</em>' attribute is set.
     * @see #unsetSensorMinimum()
     * @see #getSensorMinimum()
     * @see #setSensorMinimum(Float)
     * @generated
     */
    boolean isSetSensorMinimum();

    /**
     * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getRemoteSource <em>Remote Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteSource_MeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getRemoteSource
     * @model opposite="RemoteSource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteSource.MeasurementValue' kind='element'"
     * @generated
     */
    MeasurementValue getMeasurementValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @generated
     */
    void setMeasurementValue( MeasurementValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    void unsetMeasurementValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource#getMeasurementValue <em>Measurement Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value</em>' reference is set.
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    boolean isSetMeasurementValue();

} // RemoteSource
