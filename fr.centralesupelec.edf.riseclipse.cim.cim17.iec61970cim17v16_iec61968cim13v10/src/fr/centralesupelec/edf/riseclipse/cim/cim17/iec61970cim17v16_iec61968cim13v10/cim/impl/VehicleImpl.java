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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VehicleUsageKind;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VehicleImpl#getOdometerReadDateTime <em>Odometer Read Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VehicleImpl#getOdometerReading <em>Odometer Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VehicleImpl#getUsageKind <em>Usage Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends WorkAssetImpl implements Vehicle {
    /**
     * The default value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOdometerReadDateTime()
     * @generated
     * @ordered
     */
    protected static final Date ODOMETER_READ_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOdometerReadDateTime()
     * @generated
     * @ordered
     */
    protected Date odometerReadDateTime = ODOMETER_READ_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Odometer Read Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean odometerReadDateTimeESet;

    /**
     * The default value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOdometerReading()
     * @generated
     * @ordered
     */
    protected static final Float ODOMETER_READING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOdometerReading()
     * @generated
     * @ordered
     */
    protected Float odometerReading = ODOMETER_READING_EDEFAULT;

    /**
     * This is true if the Odometer Reading attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean odometerReadingESet;

    /**
     * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected static final VehicleUsageKind USAGE_KIND_EDEFAULT = VehicleUsageKind.CREW;

    /**
     * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsageKind()
     * @generated
     * @ordered
     */
    protected VehicleUsageKind usageKind = USAGE_KIND_EDEFAULT;

    /**
     * This is true if the Usage Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usageKindESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VehicleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVehicle();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getOdometerReadDateTime() {
        return odometerReadDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOdometerReadDateTime( Date newOdometerReadDateTime ) {
        Date oldOdometerReadDateTime = odometerReadDateTime;
        odometerReadDateTime = newOdometerReadDateTime;
        boolean oldOdometerReadDateTimeESet = odometerReadDateTimeESet;
        odometerReadDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME,
                    oldOdometerReadDateTime, odometerReadDateTime, !oldOdometerReadDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOdometerReadDateTime() {
        Date oldOdometerReadDateTime = odometerReadDateTime;
        boolean oldOdometerReadDateTimeESet = odometerReadDateTimeESet;
        odometerReadDateTime = ODOMETER_READ_DATE_TIME_EDEFAULT;
        odometerReadDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME,
                    oldOdometerReadDateTime, ODOMETER_READ_DATE_TIME_EDEFAULT, oldOdometerReadDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOdometerReadDateTime() {
        return odometerReadDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOdometerReading() {
        return odometerReading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOdometerReading( Float newOdometerReading ) {
        Float oldOdometerReading = odometerReading;
        odometerReading = newOdometerReading;
        boolean oldOdometerReadingESet = odometerReadingESet;
        odometerReadingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VEHICLE__ODOMETER_READING, oldOdometerReading, odometerReading, !oldOdometerReadingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOdometerReading() {
        Float oldOdometerReading = odometerReading;
        boolean oldOdometerReadingESet = odometerReadingESet;
        odometerReading = ODOMETER_READING_EDEFAULT;
        odometerReadingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VEHICLE__ODOMETER_READING,
                    oldOdometerReading, ODOMETER_READING_EDEFAULT, oldOdometerReadingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOdometerReading() {
        return odometerReadingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VehicleUsageKind getUsageKind() {
        return usageKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsageKind( VehicleUsageKind newUsageKind ) {
        VehicleUsageKind oldUsageKind = usageKind;
        usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VEHICLE__USAGE_KIND, oldUsageKind, usageKind, !oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsageKind() {
        VehicleUsageKind oldUsageKind = usageKind;
        boolean oldUsageKindESet = usageKindESet;
        usageKind = USAGE_KIND_EDEFAULT;
        usageKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VEHICLE__USAGE_KIND, oldUsageKind, USAGE_KIND_EDEFAULT, oldUsageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsageKind() {
        return usageKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
            return getOdometerReadDateTime();
        case CimPackage.VEHICLE__ODOMETER_READING:
            return getOdometerReading();
        case CimPackage.VEHICLE__USAGE_KIND:
            return getUsageKind();
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
        case CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
            setOdometerReadDateTime( ( Date ) newValue );
            return;
        case CimPackage.VEHICLE__ODOMETER_READING:
            setOdometerReading( ( Float ) newValue );
            return;
        case CimPackage.VEHICLE__USAGE_KIND:
            setUsageKind( ( VehicleUsageKind ) newValue );
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
        case CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
            unsetOdometerReadDateTime();
            return;
        case CimPackage.VEHICLE__ODOMETER_READING:
            unsetOdometerReading();
            return;
        case CimPackage.VEHICLE__USAGE_KIND:
            unsetUsageKind();
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
        case CimPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
            return isSetOdometerReadDateTime();
        case CimPackage.VEHICLE__ODOMETER_READING:
            return isSetOdometerReading();
        case CimPackage.VEHICLE__USAGE_KIND:
            return isSetUsageKind();
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
        result.append( " (odometerReadDateTime: " );
        if( odometerReadDateTimeESet )
            result.append( odometerReadDateTime );
        else
            result.append( "<unset>" );
        result.append( ", odometerReading: " );
        if( odometerReadingESet )
            result.append( odometerReading );
        else
            result.append( "<unset>" );
        result.append( ", usageKind: " );
        if( usageKindESet )
            result.append( usageKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VehicleImpl
