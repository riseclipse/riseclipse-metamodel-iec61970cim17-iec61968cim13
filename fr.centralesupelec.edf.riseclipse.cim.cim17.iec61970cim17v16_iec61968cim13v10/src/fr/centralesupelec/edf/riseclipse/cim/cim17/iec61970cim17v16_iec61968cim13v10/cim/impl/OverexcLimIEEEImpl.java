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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimIEEE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexc Lim IEEE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getHyst <em>Hyst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getIfdmax <em>Ifdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getItfpu <em>Itfpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getKcd <em>Kcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimIEEEImpl#getKramp <em>Kramp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcLimIEEEImpl extends OverexcitationLimiterDynamicsImpl implements OverexcLimIEEE {
    /**
     * The default value of the '{@link #getHyst() <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyst()
     * @generated
     * @ordered
     */
    protected static final Float HYST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHyst() <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyst()
     * @generated
     * @ordered
     */
    protected Float hyst = HYST_EDEFAULT;

    /**
     * This is true if the Hyst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hystESet;

    /**
     * The default value of the '{@link #getIfdlim() <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdlim()
     * @generated
     * @ordered
     */
    protected static final Float IFDLIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfdlim() <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdlim()
     * @generated
     * @ordered
     */
    protected Float ifdlim = IFDLIM_EDEFAULT;

    /**
     * This is true if the Ifdlim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifdlimESet;

    /**
     * The default value of the '{@link #getIfdmax() <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdmax()
     * @generated
     * @ordered
     */
    protected static final Float IFDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfdmax() <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdmax()
     * @generated
     * @ordered
     */
    protected Float ifdmax = IFDMAX_EDEFAULT;

    /**
     * This is true if the Ifdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifdmaxESet;

    /**
     * The default value of the '{@link #getItfpu() <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItfpu()
     * @generated
     * @ordered
     */
    protected static final Float ITFPU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItfpu() <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItfpu()
     * @generated
     * @ordered
     */
    protected Float itfpu = ITFPU_EDEFAULT;

    /**
     * This is true if the Itfpu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean itfpuESet;

    /**
     * The default value of the '{@link #getKcd() <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcd()
     * @generated
     * @ordered
     */
    protected static final Float KCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKcd() <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcd()
     * @generated
     * @ordered
     */
    protected Float kcd = KCD_EDEFAULT;

    /**
     * This is true if the Kcd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcdESet;

    /**
     * The default value of the '{@link #getKramp() <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKramp()
     * @generated
     * @ordered
     */
    protected static final Float KRAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKramp() <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKramp()
     * @generated
     * @ordered
     */
    protected Float kramp = KRAMP_EDEFAULT;

    /**
     * This is true if the Kramp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krampESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcLimIEEEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcLimIEEE();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHyst() {
        return hyst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHyst( Float newHyst ) {
        Float oldHyst = hyst;
        hyst = newHyst;
        boolean oldHystESet = hystESet;
        hystESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__HYST, oldHyst, hyst, !oldHystESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHyst() {
        Float oldHyst = hyst;
        boolean oldHystESet = hystESet;
        hyst = HYST_EDEFAULT;
        hystESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__HYST, oldHyst, HYST_EDEFAULT, oldHystESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHyst() {
        return hystESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIfdlim() {
        return ifdlim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfdlim( Float newIfdlim ) {
        Float oldIfdlim = ifdlim;
        ifdlim = newIfdlim;
        boolean oldIfdlimESet = ifdlimESet;
        ifdlimESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__IFDLIM, oldIfdlim, ifdlim, !oldIfdlimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfdlim() {
        Float oldIfdlim = ifdlim;
        boolean oldIfdlimESet = ifdlimESet;
        ifdlim = IFDLIM_EDEFAULT;
        ifdlimESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__IFDLIM, oldIfdlim, IFDLIM_EDEFAULT, oldIfdlimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfdlim() {
        return ifdlimESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIfdmax() {
        return ifdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfdmax( Float newIfdmax ) {
        Float oldIfdmax = ifdmax;
        ifdmax = newIfdmax;
        boolean oldIfdmaxESet = ifdmaxESet;
        ifdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__IFDMAX, oldIfdmax, ifdmax, !oldIfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfdmax() {
        Float oldIfdmax = ifdmax;
        boolean oldIfdmaxESet = ifdmaxESet;
        ifdmax = IFDMAX_EDEFAULT;
        ifdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__IFDMAX, oldIfdmax, IFDMAX_EDEFAULT, oldIfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfdmax() {
        return ifdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getItfpu() {
        return itfpu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setItfpu( Float newItfpu ) {
        Float oldItfpu = itfpu;
        itfpu = newItfpu;
        boolean oldItfpuESet = itfpuESet;
        itfpuESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__ITFPU, oldItfpu, itfpu, !oldItfpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetItfpu() {
        Float oldItfpu = itfpu;
        boolean oldItfpuESet = itfpuESet;
        itfpu = ITFPU_EDEFAULT;
        itfpuESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__ITFPU, oldItfpu, ITFPU_EDEFAULT, oldItfpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetItfpu() {
        return itfpuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKcd() {
        return kcd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKcd( Float newKcd ) {
        Float oldKcd = kcd;
        kcd = newKcd;
        boolean oldKcdESet = kcdESet;
        kcdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__KCD, oldKcd, kcd, !oldKcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKcd() {
        Float oldKcd = kcd;
        boolean oldKcdESet = kcdESet;
        kcd = KCD_EDEFAULT;
        kcdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__KCD, oldKcd, KCD_EDEFAULT, oldKcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKcd() {
        return kcdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKramp() {
        return kramp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKramp( Float newKramp ) {
        Float oldKramp = kramp;
        kramp = newKramp;
        boolean oldKrampESet = krampESet;
        krampESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_IEEE__KRAMP, oldKramp, kramp, !oldKrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKramp() {
        Float oldKramp = kramp;
        boolean oldKrampESet = krampESet;
        kramp = KRAMP_EDEFAULT;
        krampESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_IEEE__KRAMP, oldKramp, KRAMP_EDEFAULT, oldKrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKramp() {
        return krampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            return getHyst();
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            return getIfdlim();
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            return getIfdmax();
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            return getItfpu();
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            return getKcd();
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            return getKramp();
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
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            setHyst( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            setIfdlim( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            setIfdmax( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            setItfpu( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            setKcd( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            setKramp( ( Float ) newValue );
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
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            unsetHyst();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            unsetIfdlim();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            unsetIfdmax();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            unsetItfpu();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            unsetKcd();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            unsetKramp();
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
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            return isSetHyst();
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            return isSetIfdlim();
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            return isSetIfdmax();
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            return isSetItfpu();
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            return isSetKcd();
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            return isSetKramp();
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
        result.append( " (hyst: " );
        if( hystESet )
            result.append( hyst );
        else
            result.append( "<unset>" );
        result.append( ", ifdlim: " );
        if( ifdlimESet )
            result.append( ifdlim );
        else
            result.append( "<unset>" );
        result.append( ", ifdmax: " );
        if( ifdmaxESet )
            result.append( ifdmax );
        else
            result.append( "<unset>" );
        result.append( ", itfpu: " );
        if( itfpuESet )
            result.append( itfpu );
        else
            result.append( "<unset>" );
        result.append( ", kcd: " );
        if( kcdESet )
            result.append( kcd );
        else
            result.append( "<unset>" );
        result.append( ", kramp: " );
        if( krampESet )
            result.append( kramp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcLimIEEEImpl
