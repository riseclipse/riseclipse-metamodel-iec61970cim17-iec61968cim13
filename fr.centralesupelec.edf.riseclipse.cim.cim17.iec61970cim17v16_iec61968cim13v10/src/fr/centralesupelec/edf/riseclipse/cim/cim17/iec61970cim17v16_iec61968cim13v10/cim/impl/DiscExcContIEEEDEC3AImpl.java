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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disc Exc Cont IEEEDEC3A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC3AImpl#getTdr <em>Tdr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC3AImpl#getVtmin <em>Vtmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscExcContIEEEDEC3AImpl extends DiscontinuousExcitationControlDynamicsImpl
        implements DiscExcContIEEEDEC3A {
    /**
     * The default value of the '{@link #getTdr() <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdr()
     * @generated
     * @ordered
     */
    protected static final Float TDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdr() <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdr()
     * @generated
     * @ordered
     */
    protected Float tdr = TDR_EDEFAULT;

    /**
     * This is true if the Tdr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdrESet;

    /**
     * The default value of the '{@link #getVtmin() <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmin()
     * @generated
     * @ordered
     */
    protected static final Float VTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtmin() <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmin()
     * @generated
     * @ordered
     */
    protected Float vtmin = VTMIN_EDEFAULT;

    /**
     * This is true if the Vtmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscExcContIEEEDEC3AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscExcContIEEEDEC3A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTdr() {
        return tdr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdr( Float newTdr ) {
        Float oldTdr = tdr;
        tdr = newTdr;
        boolean oldTdrESet = tdrESet;
        tdrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR, oldTdr, tdr, !oldTdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdr() {
        Float oldTdr = tdr;
        boolean oldTdrESet = tdrESet;
        tdr = TDR_EDEFAULT;
        tdrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR, oldTdr, TDR_EDEFAULT, oldTdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdr() {
        return tdrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtmin() {
        return vtmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtmin( Float newVtmin ) {
        Float oldVtmin = vtmin;
        vtmin = newVtmin;
        boolean oldVtminESet = vtminESet;
        vtminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN, oldVtmin, vtmin, !oldVtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtmin() {
        Float oldVtmin = vtmin;
        boolean oldVtminESet = vtminESet;
        vtmin = VTMIN_EDEFAULT;
        vtminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN, oldVtmin, VTMIN_EDEFAULT, oldVtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtmin() {
        return vtminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR:
            return getTdr();
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN:
            return getVtmin();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR:
            setTdr( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN:
            setVtmin( ( Float ) newValue );
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR:
            unsetTdr();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN:
            unsetVtmin();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__TDR:
            return isSetTdr();
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A__VTMIN:
            return isSetVtmin();
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
        result.append( " (tdr: " );
        if( tdrESet )
            result.append( tdr );
        else
            result.append( "<unset>" );
        result.append( ", vtmin: " );
        if( vtminESet )
            result.append( vtmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiscExcContIEEEDEC3AImpl
