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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapeShieldCableInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tape Shield Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapeShieldCableInfoImpl#getTapeLap <em>Tape Lap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapeShieldCableInfoImpl#getTapeThickness <em>Tape Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapeShieldCableInfoImpl extends CableInfoImpl implements TapeShieldCableInfo {
    /**
     * The default value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapeLap()
     * @generated
     * @ordered
     */
    protected static final Float TAPE_LAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapeLap()
     * @generated
     * @ordered
     */
    protected Float tapeLap = TAPE_LAP_EDEFAULT;

    /**
     * This is true if the Tape Lap attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tapeLapESet;

    /**
     * The default value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapeThickness()
     * @generated
     * @ordered
     */
    protected static final Float TAPE_THICKNESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapeThickness()
     * @generated
     * @ordered
     */
    protected Float tapeThickness = TAPE_THICKNESS_EDEFAULT;

    /**
     * This is true if the Tape Thickness attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tapeThicknessESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapeShieldCableInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapeShieldCableInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTapeLap() {
        return tapeLap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTapeLap( Float newTapeLap ) {
        Float oldTapeLap = tapeLap;
        tapeLap = newTapeLap;
        boolean oldTapeLapESet = tapeLapESet;
        tapeLapESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP, oldTapeLap, tapeLap, !oldTapeLapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapeLap() {
        Float oldTapeLap = tapeLap;
        boolean oldTapeLapESet = tapeLapESet;
        tapeLap = TAPE_LAP_EDEFAULT;
        tapeLapESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP, oldTapeLap, TAPE_LAP_EDEFAULT, oldTapeLapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapeLap() {
        return tapeLapESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTapeThickness() {
        return tapeThickness;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTapeThickness( Float newTapeThickness ) {
        Float oldTapeThickness = tapeThickness;
        tapeThickness = newTapeThickness;
        boolean oldTapeThicknessESet = tapeThicknessESet;
        tapeThicknessESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS,
                    oldTapeThickness, tapeThickness, !oldTapeThicknessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapeThickness() {
        Float oldTapeThickness = tapeThickness;
        boolean oldTapeThicknessESet = tapeThicknessESet;
        tapeThickness = TAPE_THICKNESS_EDEFAULT;
        tapeThicknessESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS,
                    oldTapeThickness, TAPE_THICKNESS_EDEFAULT, oldTapeThicknessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapeThickness() {
        return tapeThicknessESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
            return getTapeLap();
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
            return getTapeThickness();
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
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
            setTapeLap( ( Float ) newValue );
            return;
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
            setTapeThickness( ( Float ) newValue );
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
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
            unsetTapeLap();
            return;
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
            unsetTapeThickness();
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
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
            return isSetTapeLap();
        case CimPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
            return isSetTapeThickness();
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
        result.append( " (tapeLap: " );
        if( tapeLapESet )
            result.append( tapeLap );
        else
            result.append( "<unset>" );
        result.append( ", tapeThickness: " );
        if( tapeThicknessESet )
            result.append( tapeThickness );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TapeShieldCableInfoImpl
