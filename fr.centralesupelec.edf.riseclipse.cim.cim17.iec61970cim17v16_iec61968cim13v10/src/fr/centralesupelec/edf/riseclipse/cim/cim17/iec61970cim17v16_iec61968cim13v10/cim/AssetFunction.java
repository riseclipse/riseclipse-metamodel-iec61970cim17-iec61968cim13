/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getConfigID <em>Config ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getFirmwareID <em>Firmware ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getProgramID <em>Program ID</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction()
 * @model
 * @generated
 */
public interface AssetFunction extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Config ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config ID</em>' attribute.
     * @see #isSetConfigID()
     * @see #unsetConfigID()
     * @see #setConfigID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction_ConfigID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetFunction.configID' kind='element'"
     * @generated
     */
    String getConfigID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getConfigID <em>Config ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config ID</em>' attribute.
     * @see #isSetConfigID()
     * @see #unsetConfigID()
     * @see #getConfigID()
     * @generated
     */
    void setConfigID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getConfigID <em>Config ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfigID()
     * @see #getConfigID()
     * @see #setConfigID(String)
     * @generated
     */
    void unsetConfigID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getConfigID <em>Config ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Config ID</em>' attribute is set.
     * @see #unsetConfigID()
     * @see #getConfigID()
     * @see #setConfigID(String)
     * @generated
     */
    boolean isSetConfigID();

    /**
     * Returns the value of the '<em><b>Firmware ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Firmware ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Firmware ID</em>' attribute.
     * @see #isSetFirmwareID()
     * @see #unsetFirmwareID()
     * @see #setFirmwareID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction_FirmwareID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetFunction.firmwareID' kind='element'"
     * @generated
     */
    String getFirmwareID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Firmware ID</em>' attribute.
     * @see #isSetFirmwareID()
     * @see #unsetFirmwareID()
     * @see #getFirmwareID()
     * @generated
     */
    void setFirmwareID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFirmwareID()
     * @see #getFirmwareID()
     * @see #setFirmwareID(String)
     * @generated
     */
    void unsetFirmwareID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Firmware ID</em>' attribute is set.
     * @see #unsetFirmwareID()
     * @see #getFirmwareID()
     * @see #setFirmwareID(String)
     * @generated
     */
    boolean isSetFirmwareID();

    /**
     * Returns the value of the '<em><b>Hardware ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hardware ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hardware ID</em>' attribute.
     * @see #isSetHardwareID()
     * @see #unsetHardwareID()
     * @see #setHardwareID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction_HardwareID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetFunction.hardwareID' kind='element'"
     * @generated
     */
    String getHardwareID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hardware ID</em>' attribute.
     * @see #isSetHardwareID()
     * @see #unsetHardwareID()
     * @see #getHardwareID()
     * @generated
     */
    void setHardwareID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHardwareID()
     * @see #getHardwareID()
     * @see #setHardwareID(String)
     * @generated
     */
    void unsetHardwareID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hardware ID</em>' attribute is set.
     * @see #unsetHardwareID()
     * @see #getHardwareID()
     * @see #setHardwareID(String)
     * @generated
     */
    boolean isSetHardwareID();

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #isSetPassword()
     * @see #unsetPassword()
     * @see #setPassword(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction_Password()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetFunction.password' kind='element'"
     * @generated
     */
    String getPassword();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #isSetPassword()
     * @see #unsetPassword()
     * @see #getPassword()
     * @generated
     */
    void setPassword( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPassword()
     * @see #getPassword()
     * @see #setPassword(String)
     * @generated
     */
    void unsetPassword();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getPassword <em>Password</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Password</em>' attribute is set.
     * @see #unsetPassword()
     * @see #getPassword()
     * @see #setPassword(String)
     * @generated
     */
    boolean isSetPassword();

    /**
     * Returns the value of the '<em><b>Program ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Program ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Program ID</em>' attribute.
     * @see #isSetProgramID()
     * @see #unsetProgramID()
     * @see #setProgramID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFunction_ProgramID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetFunction.programID' kind='element'"
     * @generated
     */
    String getProgramID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getProgramID <em>Program ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Program ID</em>' attribute.
     * @see #isSetProgramID()
     * @see #unsetProgramID()
     * @see #getProgramID()
     * @generated
     */
    void setProgramID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getProgramID <em>Program ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProgramID()
     * @see #getProgramID()
     * @see #setProgramID(String)
     * @generated
     */
    void unsetProgramID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction#getProgramID <em>Program ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Program ID</em>' attribute is set.
     * @see #unsetProgramID()
     * @see #getProgramID()
     * @see #setProgramID(String)
     * @generated
     */
    boolean isSetProgramID();

} // AssetFunction
