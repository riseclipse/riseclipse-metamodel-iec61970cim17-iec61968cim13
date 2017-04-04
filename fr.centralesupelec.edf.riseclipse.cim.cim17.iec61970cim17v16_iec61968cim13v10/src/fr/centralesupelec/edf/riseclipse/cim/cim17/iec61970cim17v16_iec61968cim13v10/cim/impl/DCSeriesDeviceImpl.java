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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCSeriesDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Series Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCSeriesDeviceImpl#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCSeriesDeviceImpl#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCSeriesDeviceImpl extends DCConductingEquipmentImpl implements DCSeriesDevice {
    /**
     * The default value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected static final Float INDUCTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected Float inductance = INDUCTANCE_EDEFAULT;

    /**
     * This is true if the Inductance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductanceESet;

    /**
     * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected static final Float RESISTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected Float resistance = RESISTANCE_EDEFAULT;

    /**
     * This is true if the Resistance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resistanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCSeriesDeviceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCSeriesDevice();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInductance() {
        return inductance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductance( Float newInductance ) {
        Float oldInductance = inductance;
        inductance = newInductance;
        boolean oldInductanceESet = inductanceESet;
        inductanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_SERIES_DEVICE__INDUCTANCE, oldInductance, inductance, !oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductance() {
        Float oldInductance = inductance;
        boolean oldInductanceESet = inductanceESet;
        inductance = INDUCTANCE_EDEFAULT;
        inductanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_SERIES_DEVICE__INDUCTANCE, oldInductance, INDUCTANCE_EDEFAULT, oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductance() {
        return inductanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getResistance() {
        return resistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResistance( Float newResistance ) {
        Float oldResistance = resistance;
        resistance = newResistance;
        boolean oldResistanceESet = resistanceESet;
        resistanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_SERIES_DEVICE__RESISTANCE, oldResistance, resistance, !oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResistance() {
        Float oldResistance = resistance;
        boolean oldResistanceESet = resistanceESet;
        resistance = RESISTANCE_EDEFAULT;
        resistanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_SERIES_DEVICE__RESISTANCE, oldResistance, RESISTANCE_EDEFAULT, oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResistance() {
        return resistanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            return getInductance();
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            return getResistance();
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
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            setInductance( ( Float ) newValue );
            return;
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            setResistance( ( Float ) newValue );
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
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            unsetInductance();
            return;
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            unsetResistance();
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
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            return isSetInductance();
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            return isSetResistance();
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
        result.append( " (inductance: " );
        if( inductanceESet )
            result.append( inductance );
        else
            result.append( "<unset>" );
        result.append( ", resistance: " );
        if( resistanceESet )
            result.append( resistance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCSeriesDeviceImpl
