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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEPFController;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type1 IEEEPF Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getOvex <em>Ovex</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getTpfc <em>Tpfc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVitmin <em>Vitmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVpf <em>Vpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVpfcbw <em>Vpfcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVpfref <em>Vpfref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PFVArType1IEEEPFControllerImpl#getVvtmin <em>Vvtmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType1IEEEPFControllerImpl extends PFVArControllerType1DynamicsImpl
        implements PFVArType1IEEEPFController {
    /**
     * The default value of the '{@link #getOvex() <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOvex()
     * @generated
     * @ordered
     */
    protected static final Boolean OVEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOvex() <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOvex()
     * @generated
     * @ordered
     */
    protected Boolean ovex = OVEX_EDEFAULT;

    /**
     * This is true if the Ovex attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ovexESet;

    /**
     * The default value of the '{@link #getTpfc() <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfc()
     * @generated
     * @ordered
     */
    protected static final Float TPFC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfc() <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfc()
     * @generated
     * @ordered
     */
    protected Float tpfc = TPFC_EDEFAULT;

    /**
     * This is true if the Tpfc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfcESet;

    /**
     * The default value of the '{@link #getVitmin() <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVitmin()
     * @generated
     * @ordered
     */
    protected static final Float VITMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVitmin() <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVitmin()
     * @generated
     * @ordered
     */
    protected Float vitmin = VITMIN_EDEFAULT;

    /**
     * This is true if the Vitmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vitminESet;

    /**
     * The default value of the '{@link #getVpf() <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpf()
     * @generated
     * @ordered
     */
    protected static final Float VPF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpf() <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpf()
     * @generated
     * @ordered
     */
    protected Float vpf = VPF_EDEFAULT;

    /**
     * This is true if the Vpf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfESet;

    /**
     * The default value of the '{@link #getVpfcbw() <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfcbw()
     * @generated
     * @ordered
     */
    protected static final Float VPFCBW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpfcbw() <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfcbw()
     * @generated
     * @ordered
     */
    protected Float vpfcbw = VPFCBW_EDEFAULT;

    /**
     * This is true if the Vpfcbw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfcbwESet;

    /**
     * The default value of the '{@link #getVpfref() <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfref()
     * @generated
     * @ordered
     */
    protected static final Float VPFREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpfref() <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfref()
     * @generated
     * @ordered
     */
    protected Float vpfref = VPFREF_EDEFAULT;

    /**
     * This is true if the Vpfref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfrefESet;

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
    protected PFVArType1IEEEPFControllerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType1IEEEPFController();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOvex() {
        return ovex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOvex( Boolean newOvex ) {
        Boolean oldOvex = ovex;
        ovex = newOvex;
        boolean oldOvexESet = ovexESet;
        ovexESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX, oldOvex, ovex, !oldOvexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOvex() {
        Boolean oldOvex = ovex;
        boolean oldOvexESet = ovexESet;
        ovex = OVEX_EDEFAULT;
        ovexESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX, oldOvex, OVEX_EDEFAULT, oldOvexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOvex() {
        return ovexESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpfc() {
        return tpfc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfc( Float newTpfc ) {
        Float oldTpfc = tpfc;
        tpfc = newTpfc;
        boolean oldTpfcESet = tpfcESet;
        tpfcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC, oldTpfc, tpfc, !oldTpfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfc() {
        Float oldTpfc = tpfc;
        boolean oldTpfcESet = tpfcESet;
        tpfc = TPFC_EDEFAULT;
        tpfcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC, oldTpfc, TPFC_EDEFAULT, oldTpfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfc() {
        return tpfcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVitmin() {
        return vitmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVitmin( Float newVitmin ) {
        Float oldVitmin = vitmin;
        vitmin = newVitmin;
        boolean oldVitminESet = vitminESet;
        vitminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN, oldVitmin, vitmin, !oldVitminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVitmin() {
        Float oldVitmin = vitmin;
        boolean oldVitminESet = vitminESet;
        vitmin = VITMIN_EDEFAULT;
        vitminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN, oldVitmin, VITMIN_EDEFAULT, oldVitminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVitmin() {
        return vitminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVpf() {
        return vpf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpf( Float newVpf ) {
        Float oldVpf = vpf;
        vpf = newVpf;
        boolean oldVpfESet = vpfESet;
        vpfESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF, oldVpf, vpf, !oldVpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpf() {
        Float oldVpf = vpf;
        boolean oldVpfESet = vpfESet;
        vpf = VPF_EDEFAULT;
        vpfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF, oldVpf, VPF_EDEFAULT, oldVpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpf() {
        return vpfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVpfcbw() {
        return vpfcbw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpfcbw( Float newVpfcbw ) {
        Float oldVpfcbw = vpfcbw;
        vpfcbw = newVpfcbw;
        boolean oldVpfcbwESet = vpfcbwESet;
        vpfcbwESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW, oldVpfcbw, vpfcbw, !oldVpfcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpfcbw() {
        Float oldVpfcbw = vpfcbw;
        boolean oldVpfcbwESet = vpfcbwESet;
        vpfcbw = VPFCBW_EDEFAULT;
        vpfcbwESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW, oldVpfcbw, VPFCBW_EDEFAULT, oldVpfcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpfcbw() {
        return vpfcbwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVpfref() {
        return vpfref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpfref( Float newVpfref ) {
        Float oldVpfref = vpfref;
        vpfref = newVpfref;
        boolean oldVpfrefESet = vpfrefESet;
        vpfrefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF, oldVpfref, vpfref, !oldVpfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpfref() {
        Float oldVpfref = vpfref;
        boolean oldVpfrefESet = vpfrefESet;
        vpfref = VPFREF_EDEFAULT;
        vpfrefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF, oldVpfref, VPFREF_EDEFAULT, oldVpfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpfref() {
        return vpfrefESet;
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
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX, oldVvtmax, vvtmax, !oldVvtmaxESet ) );
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
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX, oldVvtmax, VVTMAX_EDEFAULT, oldVvtmaxESet ) );
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
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN, oldVvtmin, vvtmin, !oldVvtminESet ) );
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
                CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN, oldVvtmin, VVTMIN_EDEFAULT, oldVvtminESet ) );
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            return getOvex();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            return getTpfc();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            return getVitmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            return getVpf();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            return getVpfcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            return getVpfref();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            return getVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            setOvex( ( Boolean ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            setTpfc( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            setVitmin( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            setVpf( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            setVpfcbw( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            setVpfref( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            setVvtmax( ( Float ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            unsetOvex();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            unsetTpfc();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            unsetVitmin();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            unsetVpf();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            unsetVpfcbw();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            unsetVpfref();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            unsetVvtmax();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            return isSetOvex();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            return isSetTpfc();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            return isSetVitmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            return isSetVpf();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            return isSetVpfcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            return isSetVpfref();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            return isSetVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (ovex: " );
        if( ovexESet )
            result.append( ovex );
        else
            result.append( "<unset>" );
        result.append( ", tpfc: " );
        if( tpfcESet )
            result.append( tpfc );
        else
            result.append( "<unset>" );
        result.append( ", vitmin: " );
        if( vitminESet )
            result.append( vitmin );
        else
            result.append( "<unset>" );
        result.append( ", vpf: " );
        if( vpfESet )
            result.append( vpf );
        else
            result.append( "<unset>" );
        result.append( ", vpfcbw: " );
        if( vpfcbwESet )
            result.append( vpfcbw );
        else
            result.append( "<unset>" );
        result.append( ", vpfref: " );
        if( vpfrefESet )
            result.append( vpfref );
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

} //PFVArType1IEEEPFControllerImpl
