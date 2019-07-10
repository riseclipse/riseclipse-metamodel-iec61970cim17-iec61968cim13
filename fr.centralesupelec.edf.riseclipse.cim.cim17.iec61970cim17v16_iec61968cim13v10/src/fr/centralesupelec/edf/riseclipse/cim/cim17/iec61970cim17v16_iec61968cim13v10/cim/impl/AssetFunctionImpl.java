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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetFunctionImpl#getConfigID <em>Config ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetFunctionImpl#getFirmwareID <em>Firmware ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetFunctionImpl#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetFunctionImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetFunctionImpl#getProgramID <em>Program ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetFunctionImpl extends IdentifiedObjectImpl implements AssetFunction {
    /**
     * The default value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigID()
     * @generated
     * @ordered
     */
    protected static final String CONFIG_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigID()
     * @generated
     * @ordered
     */
    protected String configID = CONFIG_ID_EDEFAULT;

    /**
     * This is true if the Config ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean configIDESet;

    /**
     * The default value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirmwareID()
     * @generated
     * @ordered
     */
    protected static final String FIRMWARE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirmwareID()
     * @generated
     * @ordered
     */
    protected String firmwareID = FIRMWARE_ID_EDEFAULT;

    /**
     * This is true if the Firmware ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean firmwareIDESet;

    /**
     * The default value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareID()
     * @generated
     * @ordered
     */
    protected static final String HARDWARE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHardwareID()
     * @generated
     * @ordered
     */
    protected String hardwareID = HARDWARE_ID_EDEFAULT;

    /**
     * This is true if the Hardware ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hardwareIDESet;

    /**
     * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected static final String PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected String password = PASSWORD_EDEFAULT;

    /**
     * This is true if the Password attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean passwordESet;

    /**
     * The default value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgramID()
     * @generated
     * @ordered
     */
    protected static final String PROGRAM_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProgramID()
     * @generated
     * @ordered
     */
    protected String programID = PROGRAM_ID_EDEFAULT;

    /**
     * This is true if the Program ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean programIDESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConfigID() {
        return configID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfigID( String newConfigID ) {
        String oldConfigID = configID;
        configID = newConfigID;
        boolean oldConfigIDESet = configIDESet;
        configIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_FUNCTION__CONFIG_ID, oldConfigID, configID, !oldConfigIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigID() {
        String oldConfigID = configID;
        boolean oldConfigIDESet = configIDESet;
        configID = CONFIG_ID_EDEFAULT;
        configIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_FUNCTION__CONFIG_ID, oldConfigID, CONFIG_ID_EDEFAULT, oldConfigIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigID() {
        return configIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFirmwareID() {
        return firmwareID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFirmwareID( String newFirmwareID ) {
        String oldFirmwareID = firmwareID;
        firmwareID = newFirmwareID;
        boolean oldFirmwareIDESet = firmwareIDESet;
        firmwareIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_FUNCTION__FIRMWARE_ID, oldFirmwareID, firmwareID, !oldFirmwareIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFirmwareID() {
        String oldFirmwareID = firmwareID;
        boolean oldFirmwareIDESet = firmwareIDESet;
        firmwareID = FIRMWARE_ID_EDEFAULT;
        firmwareIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_FUNCTION__FIRMWARE_ID, oldFirmwareID, FIRMWARE_ID_EDEFAULT, oldFirmwareIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirmwareID() {
        return firmwareIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHardwareID() {
        return hardwareID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHardwareID( String newHardwareID ) {
        String oldHardwareID = hardwareID;
        hardwareID = newHardwareID;
        boolean oldHardwareIDESet = hardwareIDESet;
        hardwareIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_FUNCTION__HARDWARE_ID, oldHardwareID, hardwareID, !oldHardwareIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHardwareID() {
        String oldHardwareID = hardwareID;
        boolean oldHardwareIDESet = hardwareIDESet;
        hardwareID = HARDWARE_ID_EDEFAULT;
        hardwareIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_FUNCTION__HARDWARE_ID, oldHardwareID, HARDWARE_ID_EDEFAULT, oldHardwareIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHardwareID() {
        return hardwareIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPassword( String newPassword ) {
        String oldPassword = password;
        password = newPassword;
        boolean oldPasswordESet = passwordESet;
        passwordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_FUNCTION__PASSWORD, oldPassword, password, !oldPasswordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPassword() {
        String oldPassword = password;
        boolean oldPasswordESet = passwordESet;
        password = PASSWORD_EDEFAULT;
        passwordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_FUNCTION__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPassword() {
        return passwordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProgramID() {
        return programID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProgramID( String newProgramID ) {
        String oldProgramID = programID;
        programID = newProgramID;
        boolean oldProgramIDESet = programIDESet;
        programIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_FUNCTION__PROGRAM_ID, oldProgramID, programID, !oldProgramIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProgramID() {
        String oldProgramID = programID;
        boolean oldProgramIDESet = programIDESet;
        programID = PROGRAM_ID_EDEFAULT;
        programIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_FUNCTION__PROGRAM_ID, oldProgramID, PROGRAM_ID_EDEFAULT, oldProgramIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProgramID() {
        return programIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ASSET_FUNCTION__CONFIG_ID:
            return getConfigID();
        case CimPackage.ASSET_FUNCTION__FIRMWARE_ID:
            return getFirmwareID();
        case CimPackage.ASSET_FUNCTION__HARDWARE_ID:
            return getHardwareID();
        case CimPackage.ASSET_FUNCTION__PASSWORD:
            return getPassword();
        case CimPackage.ASSET_FUNCTION__PROGRAM_ID:
            return getProgramID();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ASSET_FUNCTION__CONFIG_ID:
            setConfigID( ( String ) newValue );
            return;
        case CimPackage.ASSET_FUNCTION__FIRMWARE_ID:
            setFirmwareID( ( String ) newValue );
            return;
        case CimPackage.ASSET_FUNCTION__HARDWARE_ID:
            setHardwareID( ( String ) newValue );
            return;
        case CimPackage.ASSET_FUNCTION__PASSWORD:
            setPassword( ( String ) newValue );
            return;
        case CimPackage.ASSET_FUNCTION__PROGRAM_ID:
            setProgramID( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.ASSET_FUNCTION__CONFIG_ID:
            unsetConfigID();
            return;
        case CimPackage.ASSET_FUNCTION__FIRMWARE_ID:
            unsetFirmwareID();
            return;
        case CimPackage.ASSET_FUNCTION__HARDWARE_ID:
            unsetHardwareID();
            return;
        case CimPackage.ASSET_FUNCTION__PASSWORD:
            unsetPassword();
            return;
        case CimPackage.ASSET_FUNCTION__PROGRAM_ID:
            unsetProgramID();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.ASSET_FUNCTION__CONFIG_ID:
            return isSetConfigID();
        case CimPackage.ASSET_FUNCTION__FIRMWARE_ID:
            return isSetFirmwareID();
        case CimPackage.ASSET_FUNCTION__HARDWARE_ID:
            return isSetHardwareID();
        case CimPackage.ASSET_FUNCTION__PASSWORD:
            return isSetPassword();
        case CimPackage.ASSET_FUNCTION__PROGRAM_ID:
            return isSetProgramID();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (configID: " );
        if( configIDESet )
            result.append( configID );
        else
            result.append( "<unset>" );
        result.append( ", firmwareID: " );
        if( firmwareIDESet )
            result.append( firmwareID );
        else
            result.append( "<unset>" );
        result.append( ", hardwareID: " );
        if( hardwareIDESet )
            result.append( hardwareID );
        else
            result.append( "<unset>" );
        result.append( ", password: " );
        if( passwordESet )
            result.append( password );
        else
            result.append( "<unset>" );
        result.append( ", programID: " );
        if( programIDESet )
            result.append( programID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetFunctionImpl
