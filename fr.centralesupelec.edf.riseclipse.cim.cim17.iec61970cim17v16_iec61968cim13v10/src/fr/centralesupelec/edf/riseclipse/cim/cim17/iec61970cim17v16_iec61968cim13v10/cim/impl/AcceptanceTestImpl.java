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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AcceptanceTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceptance Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AcceptanceTestImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AcceptanceTestImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AcceptanceTestImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptanceTestImpl extends MinimalEObjectImpl.Container implements AcceptanceTest {
    /**
     * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected static final Date DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected Date dateTime = DATE_TIME_EDEFAULT;

    /**
     * This is true if the Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateTimeESet;

    /**
     * The default value of the '{@link #getSuccess() <em>Success</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuccess()
     * @generated
     * @ordered
     */
    protected static final Boolean SUCCESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuccess() <em>Success</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuccess()
     * @generated
     * @ordered
     */
    protected Boolean success = SUCCESS_EDEFAULT;

    /**
     * This is true if the Success attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean successESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AcceptanceTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAcceptanceTest();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDateTime( Date newDateTime ) {
        Date oldDateTime = dateTime;
        dateTime = newDateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCEPTANCE_TEST__DATE_TIME, oldDateTime, dateTime, !oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDateTime() {
        Date oldDateTime = dateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTime = DATE_TIME_EDEFAULT;
        dateTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCEPTANCE_TEST__DATE_TIME, oldDateTime, DATE_TIME_EDEFAULT, oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDateTime() {
        return dateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSuccess() {
        return success;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuccess( Boolean newSuccess ) {
        Boolean oldSuccess = success;
        success = newSuccess;
        boolean oldSuccessESet = successESet;
        successESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCEPTANCE_TEST__SUCCESS, oldSuccess, success, !oldSuccessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuccess() {
        Boolean oldSuccess = success;
        boolean oldSuccessESet = successESet;
        success = SUCCESS_EDEFAULT;
        successESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCEPTANCE_TEST__SUCCESS, oldSuccess, SUCCESS_EDEFAULT, oldSuccessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuccess() {
        return successESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCEPTANCE_TEST__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCEPTANCE_TEST__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ACCEPTANCE_TEST__DATE_TIME:
            return getDateTime();
        case CimPackage.ACCEPTANCE_TEST__SUCCESS:
            return getSuccess();
        case CimPackage.ACCEPTANCE_TEST__TYPE:
            return getType();
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
        case CimPackage.ACCEPTANCE_TEST__DATE_TIME:
            setDateTime( ( Date ) newValue );
            return;
        case CimPackage.ACCEPTANCE_TEST__SUCCESS:
            setSuccess( ( Boolean ) newValue );
            return;
        case CimPackage.ACCEPTANCE_TEST__TYPE:
            setType( ( String ) newValue );
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
        case CimPackage.ACCEPTANCE_TEST__DATE_TIME:
            unsetDateTime();
            return;
        case CimPackage.ACCEPTANCE_TEST__SUCCESS:
            unsetSuccess();
            return;
        case CimPackage.ACCEPTANCE_TEST__TYPE:
            unsetType();
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
        case CimPackage.ACCEPTANCE_TEST__DATE_TIME:
            return isSetDateTime();
        case CimPackage.ACCEPTANCE_TEST__SUCCESS:
            return isSetSuccess();
        case CimPackage.ACCEPTANCE_TEST__TYPE:
            return isSetType();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (dateTime: " );
        if( dateTimeESet )
            result.append( dateTime );
        else
            result.append( "<unset>" );
        result.append( ", success: " );
        if( successESet )
            result.append( success );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AcceptanceTestImpl
