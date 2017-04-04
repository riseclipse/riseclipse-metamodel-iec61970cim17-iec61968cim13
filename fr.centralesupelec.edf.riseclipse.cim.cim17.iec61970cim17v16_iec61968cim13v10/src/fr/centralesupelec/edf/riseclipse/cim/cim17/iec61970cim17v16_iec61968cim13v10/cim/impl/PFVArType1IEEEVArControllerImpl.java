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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type1 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getTvarc <em>Tvarc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getVvar <em>Vvar</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getVvarcbw <em>Vvarcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getVvarref <em>Vvarref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEVArControllerImpl#getVvtmin <em>Vvtmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType1IEEEVArControllerImpl extends PFVArControllerType1DynamicsImpl
        implements PFVArType1IEEEVArController {
    /**
     * The default value of the '{@link #getTvarc() <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvarc()
     * @generated
     * @ordered
     */
    protected static final Float TVARC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTvarc() <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvarc()
     * @generated
     * @ordered
     */
    protected Float tvarc = TVARC_EDEFAULT;

    /**
     * This is true if the Tvarc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvarcESet;

    /**
     * The default value of the '{@link #getVvar() <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvar()
     * @generated
     * @ordered
     */
    protected static final Float VVAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvar() <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvar()
     * @generated
     * @ordered
     */
    protected Float vvar = VVAR_EDEFAULT;

    /**
     * This is true if the Vvar attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvarESet;

    /**
     * The default value of the '{@link #getVvarcbw() <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvarcbw()
     * @generated
     * @ordered
     */
    protected static final Float VVARCBW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvarcbw() <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvarcbw()
     * @generated
     * @ordered
     */
    protected Float vvarcbw = VVARCBW_EDEFAULT;

    /**
     * This is true if the Vvarcbw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvarcbwESet;

    /**
     * The default value of the '{@link #getVvarref() <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvarref()
     * @generated
     * @ordered
     */
    protected static final Float VVARREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvarref() <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvarref()
     * @generated
     * @ordered
     */
    protected Float vvarref = VVARREF_EDEFAULT;

    /**
     * This is true if the Vvarref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvarrefESet;

    /**
     * The default value of the '{@link #getVvtmax() <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmax()
     * @generated
     * @ordered
     */
    protected static final Float VVTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvtmax() <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmax()
     * @generated
     * @ordered
     */
    protected Float vvtmax = VVTMAX_EDEFAULT;

    /**
     * This is true if the Vvtmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvtmaxESet;

    /**
     * The default value of the '{@link #getVvtmin() <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmin()
     * @generated
     * @ordered
     */
    protected static final Float VVTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvtmin() <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmin()
     * @generated
     * @ordered
     */
    protected Float vvtmin = VVTMIN_EDEFAULT;

    /**
     * This is true if the Vvtmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvtminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PFVArType1IEEEVArControllerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType1IEEEVArController();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTvarc() {
        return tvarc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTvarc( Float newTvarc ) {
        Float oldTvarc = tvarc;
        tvarc = newTvarc;
        boolean oldTvarcESet = tvarcESet;
        tvarcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC, oldTvarc, tvarc, !oldTvarcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTvarc() {
        Float oldTvarc = tvarc;
        boolean oldTvarcESet = tvarcESet;
        tvarc = TVARC_EDEFAULT;
        tvarcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC, oldTvarc, TVARC_EDEFAULT, oldTvarcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTvarc() {
        return tvarcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVvar() {
        return vvar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvar( Float newVvar ) {
        Float oldVvar = vvar;
        vvar = newVvar;
        boolean oldVvarESet = vvarESet;
        vvarESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR, oldVvar, vvar, !oldVvarESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvar() {
        Float oldVvar = vvar;
        boolean oldVvarESet = vvarESet;
        vvar = VVAR_EDEFAULT;
        vvarESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR, oldVvar, VVAR_EDEFAULT, oldVvarESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvar() {
        return vvarESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVvarcbw() {
        return vvarcbw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvarcbw( Float newVvarcbw ) {
        Float oldVvarcbw = vvarcbw;
        vvarcbw = newVvarcbw;
        boolean oldVvarcbwESet = vvarcbwESet;
        vvarcbwESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW, oldVvarcbw, vvarcbw, !oldVvarcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvarcbw() {
        Float oldVvarcbw = vvarcbw;
        boolean oldVvarcbwESet = vvarcbwESet;
        vvarcbw = VVARCBW_EDEFAULT;
        vvarcbwESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW, oldVvarcbw, VVARCBW_EDEFAULT, oldVvarcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvarcbw() {
        return vvarcbwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVvarref() {
        return vvarref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvarref( Float newVvarref ) {
        Float oldVvarref = vvarref;
        vvarref = newVvarref;
        boolean oldVvarrefESet = vvarrefESet;
        vvarrefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF, oldVvarref, vvarref, !oldVvarrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvarref() {
        Float oldVvarref = vvarref;
        boolean oldVvarrefESet = vvarrefESet;
        vvarref = VVARREF_EDEFAULT;
        vvarrefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF, oldVvarref, VVARREF_EDEFAULT, oldVvarrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvarref() {
        return vvarrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVvtmax() {
        return vvtmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvtmax( Float newVvtmax ) {
        Float oldVvtmax = vvtmax;
        vvtmax = newVvtmax;
        boolean oldVvtmaxESet = vvtmaxESet;
        vvtmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX, oldVvtmax, vvtmax, !oldVvtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvtmax() {
        Float oldVvtmax = vvtmax;
        boolean oldVvtmaxESet = vvtmaxESet;
        vvtmax = VVTMAX_EDEFAULT;
        vvtmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX, oldVvtmax, VVTMAX_EDEFAULT, oldVvtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvtmax() {
        return vvtmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVvtmin() {
        return vvtmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvtmin( Float newVvtmin ) {
        Float oldVvtmin = vvtmin;
        vvtmin = newVvtmin;
        boolean oldVvtminESet = vvtminESet;
        vvtminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN, oldVvtmin, vvtmin, !oldVvtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvtmin() {
        Float oldVvtmin = vvtmin;
        boolean oldVvtminESet = vvtminESet;
        vvtmin = VVTMIN_EDEFAULT;
        vvtminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN, oldVvtmin, VVTMIN_EDEFAULT, oldVvtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvtmin() {
        return vvtminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC:
            return getTvarc();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR:
            return getVvar();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW:
            return getVvarcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF:
            return getVvarref();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX:
            return getVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN:
            return getVvtmin();
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
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC:
            setTvarc( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR:
            setVvar( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW:
            setVvarcbw( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF:
            setVvarref( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX:
            setVvtmax( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN:
            setVvtmin( ( Float ) newValue );
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
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC:
            unsetTvarc();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR:
            unsetVvar();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW:
            unsetVvarcbw();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF:
            unsetVvarref();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX:
            unsetVvtmax();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN:
            unsetVvtmin();
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
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC:
            return isSetTvarc();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR:
            return isSetVvar();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW:
            return isSetVvarcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF:
            return isSetVvarref();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX:
            return isSetVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN:
            return isSetVvtmin();
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
        result.append( " (tvarc: " );
        if( tvarcESet )
            result.append( tvarc );
        else
            result.append( "<unset>" );
        result.append( ", vvar: " );
        if( vvarESet )
            result.append( vvar );
        else
            result.append( "<unset>" );
        result.append( ", vvarcbw: " );
        if( vvarcbwESet )
            result.append( vvarcbw );
        else
            result.append( "<unset>" );
        result.append( ", vvarref: " );
        if( vvarrefESet )
            result.append( vvarref );
        else
            result.append( "<unset>" );
        result.append( ", vvtmax: " );
        if( vvtmaxESet )
            result.append( vvtmax );
        else
            result.append( "<unset>" );
        result.append( ", vvtmin: " );
        if( vvtminESet )
            result.append( vvtmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PFVArType1IEEEVArControllerImpl
