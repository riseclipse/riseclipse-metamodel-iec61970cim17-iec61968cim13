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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VAdj IEEE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getAdjslew <em>Adjslew</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getTaoff <em>Taoff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getTaon <em>Taon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getVadjf <em>Vadjf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getVadjmax <em>Vadjmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VAdjIEEEImpl#getVadjmin <em>Vadjmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VAdjIEEEImpl extends VoltageAdjusterDynamicsImpl implements VAdjIEEE {
    /**
     * The default value of the '{@link #getAdjslew() <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdjslew()
     * @generated
     * @ordered
     */
    protected static final Float ADJSLEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAdjslew() <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdjslew()
     * @generated
     * @ordered
     */
    protected Float adjslew = ADJSLEW_EDEFAULT;

    /**
     * This is true if the Adjslew attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean adjslewESet;

    /**
     * The default value of the '{@link #getTaoff() <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaoff()
     * @generated
     * @ordered
     */
    protected static final Float TAOFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaoff() <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaoff()
     * @generated
     * @ordered
     */
    protected Float taoff = TAOFF_EDEFAULT;

    /**
     * This is true if the Taoff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taoffESet;

    /**
     * The default value of the '{@link #getTaon() <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaon()
     * @generated
     * @ordered
     */
    protected static final Float TAON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaon() <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaon()
     * @generated
     * @ordered
     */
    protected Float taon = TAON_EDEFAULT;

    /**
     * This is true if the Taon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taonESet;

    /**
     * The default value of the '{@link #getVadjf() <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjf()
     * @generated
     * @ordered
     */
    protected static final Float VADJF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVadjf() <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjf()
     * @generated
     * @ordered
     */
    protected Float vadjf = VADJF_EDEFAULT;

    /**
     * This is true if the Vadjf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vadjfESet;

    /**
     * The default value of the '{@link #getVadjmax() <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjmax()
     * @generated
     * @ordered
     */
    protected static final Float VADJMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVadjmax() <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjmax()
     * @generated
     * @ordered
     */
    protected Float vadjmax = VADJMAX_EDEFAULT;

    /**
     * This is true if the Vadjmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vadjmaxESet;

    /**
     * The default value of the '{@link #getVadjmin() <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjmin()
     * @generated
     * @ordered
     */
    protected static final Float VADJMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVadjmin() <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadjmin()
     * @generated
     * @ordered
     */
    protected Float vadjmin = VADJMIN_EDEFAULT;

    /**
     * This is true if the Vadjmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vadjminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VAdjIEEEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVAdjIEEE();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAdjslew() {
        return adjslew;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAdjslew( Float newAdjslew ) {
        Float oldAdjslew = adjslew;
        adjslew = newAdjslew;
        boolean oldAdjslewESet = adjslewESet;
        adjslewESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__ADJSLEW, oldAdjslew, adjslew, !oldAdjslewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAdjslew() {
        Float oldAdjslew = adjslew;
        boolean oldAdjslewESet = adjslewESet;
        adjslew = ADJSLEW_EDEFAULT;
        adjslewESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__ADJSLEW, oldAdjslew, ADJSLEW_EDEFAULT, oldAdjslewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAdjslew() {
        return adjslewESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTaoff() {
        return taoff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTaoff( Float newTaoff ) {
        Float oldTaoff = taoff;
        taoff = newTaoff;
        boolean oldTaoffESet = taoffESet;
        taoffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__TAOFF, oldTaoff, taoff, !oldTaoffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTaoff() {
        Float oldTaoff = taoff;
        boolean oldTaoffESet = taoffESet;
        taoff = TAOFF_EDEFAULT;
        taoffESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__TAOFF, oldTaoff, TAOFF_EDEFAULT, oldTaoffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTaoff() {
        return taoffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTaon() {
        return taon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTaon( Float newTaon ) {
        Float oldTaon = taon;
        taon = newTaon;
        boolean oldTaonESet = taonESet;
        taonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__TAON, oldTaon, taon, !oldTaonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTaon() {
        Float oldTaon = taon;
        boolean oldTaonESet = taonESet;
        taon = TAON_EDEFAULT;
        taonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__TAON, oldTaon, TAON_EDEFAULT, oldTaonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTaon() {
        return taonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVadjf() {
        return vadjf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVadjf( Float newVadjf ) {
        Float oldVadjf = vadjf;
        vadjf = newVadjf;
        boolean oldVadjfESet = vadjfESet;
        vadjfESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__VADJF, oldVadjf, vadjf, !oldVadjfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVadjf() {
        Float oldVadjf = vadjf;
        boolean oldVadjfESet = vadjfESet;
        vadjf = VADJF_EDEFAULT;
        vadjfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__VADJF, oldVadjf, VADJF_EDEFAULT, oldVadjfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVadjf() {
        return vadjfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVadjmax() {
        return vadjmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVadjmax( Float newVadjmax ) {
        Float oldVadjmax = vadjmax;
        vadjmax = newVadjmax;
        boolean oldVadjmaxESet = vadjmaxESet;
        vadjmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__VADJMAX, oldVadjmax, vadjmax, !oldVadjmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVadjmax() {
        Float oldVadjmax = vadjmax;
        boolean oldVadjmaxESet = vadjmaxESet;
        vadjmax = VADJMAX_EDEFAULT;
        vadjmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__VADJMAX, oldVadjmax, VADJMAX_EDEFAULT, oldVadjmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVadjmax() {
        return vadjmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVadjmin() {
        return vadjmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVadjmin( Float newVadjmin ) {
        Float oldVadjmin = vadjmin;
        vadjmin = newVadjmin;
        boolean oldVadjminESet = vadjminESet;
        vadjminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VADJ_IEEE__VADJMIN, oldVadjmin, vadjmin, !oldVadjminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVadjmin() {
        Float oldVadjmin = vadjmin;
        boolean oldVadjminESet = vadjminESet;
        vadjmin = VADJMIN_EDEFAULT;
        vadjminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VADJ_IEEE__VADJMIN, oldVadjmin, VADJMIN_EDEFAULT, oldVadjminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVadjmin() {
        return vadjminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.VADJ_IEEE__ADJSLEW:
            return getAdjslew();
        case CimPackage.VADJ_IEEE__TAOFF:
            return getTaoff();
        case CimPackage.VADJ_IEEE__TAON:
            return getTaon();
        case CimPackage.VADJ_IEEE__VADJF:
            return getVadjf();
        case CimPackage.VADJ_IEEE__VADJMAX:
            return getVadjmax();
        case CimPackage.VADJ_IEEE__VADJMIN:
            return getVadjmin();
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
        case CimPackage.VADJ_IEEE__ADJSLEW:
            setAdjslew( ( Float ) newValue );
            return;
        case CimPackage.VADJ_IEEE__TAOFF:
            setTaoff( ( Float ) newValue );
            return;
        case CimPackage.VADJ_IEEE__TAON:
            setTaon( ( Float ) newValue );
            return;
        case CimPackage.VADJ_IEEE__VADJF:
            setVadjf( ( Float ) newValue );
            return;
        case CimPackage.VADJ_IEEE__VADJMAX:
            setVadjmax( ( Float ) newValue );
            return;
        case CimPackage.VADJ_IEEE__VADJMIN:
            setVadjmin( ( Float ) newValue );
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
        case CimPackage.VADJ_IEEE__ADJSLEW:
            unsetAdjslew();
            return;
        case CimPackage.VADJ_IEEE__TAOFF:
            unsetTaoff();
            return;
        case CimPackage.VADJ_IEEE__TAON:
            unsetTaon();
            return;
        case CimPackage.VADJ_IEEE__VADJF:
            unsetVadjf();
            return;
        case CimPackage.VADJ_IEEE__VADJMAX:
            unsetVadjmax();
            return;
        case CimPackage.VADJ_IEEE__VADJMIN:
            unsetVadjmin();
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
        case CimPackage.VADJ_IEEE__ADJSLEW:
            return isSetAdjslew();
        case CimPackage.VADJ_IEEE__TAOFF:
            return isSetTaoff();
        case CimPackage.VADJ_IEEE__TAON:
            return isSetTaon();
        case CimPackage.VADJ_IEEE__VADJF:
            return isSetVadjf();
        case CimPackage.VADJ_IEEE__VADJMAX:
            return isSetVadjmax();
        case CimPackage.VADJ_IEEE__VADJMIN:
            return isSetVadjmin();
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
        result.append( " (adjslew: " );
        if( adjslewESet )
            result.append( adjslew );
        else
            result.append( "<unset>" );
        result.append( ", taoff: " );
        if( taoffESet )
            result.append( taoff );
        else
            result.append( "<unset>" );
        result.append( ", taon: " );
        if( taonESet )
            result.append( taon );
        else
            result.append( "<unset>" );
        result.append( ", vadjf: " );
        if( vadjfESet )
            result.append( vadjf );
        else
            result.append( "<unset>" );
        result.append( ", vadjmax: " );
        if( vadjmaxESet )
            result.append( vadjmax );
        else
            result.append( "<unset>" );
        result.append( ", vadjmin: " );
        if( vadjminESet )
            result.append( vadjmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VAdjIEEEImpl
