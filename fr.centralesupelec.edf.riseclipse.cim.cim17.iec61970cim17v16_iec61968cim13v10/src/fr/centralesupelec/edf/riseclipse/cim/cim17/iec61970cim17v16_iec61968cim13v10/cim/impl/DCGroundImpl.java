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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCGround;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Ground</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCGroundImpl#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCGroundImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCGroundImpl extends DCConductingEquipmentImpl implements DCGround {
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
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCGroundImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCGround();
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
                CimPackage.DC_GROUND__INDUCTANCE, oldInductance, inductance, !oldInductanceESet ) );
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
                CimPackage.DC_GROUND__INDUCTANCE, oldInductance, INDUCTANCE_EDEFAULT, oldInductanceESet ) );
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
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_GROUND__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_GROUND__R,
                oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DC_GROUND__INDUCTANCE:
            return getInductance();
        case CimPackage.DC_GROUND__R:
            return getR();
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
        case CimPackage.DC_GROUND__INDUCTANCE:
            setInductance( ( Float ) newValue );
            return;
        case CimPackage.DC_GROUND__R:
            setR( ( Float ) newValue );
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
        case CimPackage.DC_GROUND__INDUCTANCE:
            unsetInductance();
            return;
        case CimPackage.DC_GROUND__R:
            unsetR();
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
        case CimPackage.DC_GROUND__INDUCTANCE:
            return isSetInductance();
        case CimPackage.DC_GROUND__R:
            return isSetR();
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
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCGroundImpl
