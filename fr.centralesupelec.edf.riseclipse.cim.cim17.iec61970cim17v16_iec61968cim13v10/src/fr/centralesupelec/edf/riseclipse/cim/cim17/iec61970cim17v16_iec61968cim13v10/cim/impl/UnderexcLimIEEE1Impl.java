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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underexc Lim IEEE1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getKuc <em>Kuc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getKuf <em>Kuf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getKul <em>Kul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getKur <em>Kur</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getTu1 <em>Tu1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getTu2 <em>Tu2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getTu3 <em>Tu3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getTu4 <em>Tu4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVucmax <em>Vucmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVuimin <em>Vuimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVulmax <em>Vulmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVulmin <em>Vulmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE1Impl#getVurmax <em>Vurmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderexcLimIEEE1Impl extends UnderexcitationLimiterDynamicsImpl implements UnderexcLimIEEE1 {
    /**
     * The default value of the '{@link #getKuc() <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuc()
     * @generated
     * @ordered
     */
    protected static final Float KUC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKuc() <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuc()
     * @generated
     * @ordered
     */
    protected Float kuc = KUC_EDEFAULT;

    /**
     * This is true if the Kuc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kucESet;

    /**
     * The default value of the '{@link #getKuf() <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuf()
     * @generated
     * @ordered
     */
    protected static final Float KUF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKuf() <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuf()
     * @generated
     * @ordered
     */
    protected Float kuf = KUF_EDEFAULT;

    /**
     * This is true if the Kuf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kufESet;

    /**
     * The default value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected static final Float KUI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected Float kui = KUI_EDEFAULT;

    /**
     * This is true if the Kui attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kuiESet;

    /**
     * The default value of the '{@link #getKul() <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKul()
     * @generated
     * @ordered
     */
    protected static final Float KUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKul() <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKul()
     * @generated
     * @ordered
     */
    protected Float kul = KUL_EDEFAULT;

    /**
     * This is true if the Kul attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kulESet;

    /**
     * The default value of the '{@link #getKur() <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKur()
     * @generated
     * @ordered
     */
    protected static final Float KUR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKur() <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKur()
     * @generated
     * @ordered
     */
    protected Float kur = KUR_EDEFAULT;

    /**
     * This is true if the Kur attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kurESet;

    /**
     * The default value of the '{@link #getTu1() <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu1()
     * @generated
     * @ordered
     */
    protected static final Float TU1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu1() <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu1()
     * @generated
     * @ordered
     */
    protected Float tu1 = TU1_EDEFAULT;

    /**
     * This is true if the Tu1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu1ESet;

    /**
     * The default value of the '{@link #getTu2() <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu2()
     * @generated
     * @ordered
     */
    protected static final Float TU2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu2() <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu2()
     * @generated
     * @ordered
     */
    protected Float tu2 = TU2_EDEFAULT;

    /**
     * This is true if the Tu2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu2ESet;

    /**
     * The default value of the '{@link #getTu3() <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu3()
     * @generated
     * @ordered
     */
    protected static final Float TU3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu3() <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu3()
     * @generated
     * @ordered
     */
    protected Float tu3 = TU3_EDEFAULT;

    /**
     * This is true if the Tu3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu3ESet;

    /**
     * The default value of the '{@link #getTu4() <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu4()
     * @generated
     * @ordered
     */
    protected static final Float TU4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu4() <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu4()
     * @generated
     * @ordered
     */
    protected Float tu4 = TU4_EDEFAULT;

    /**
     * This is true if the Tu4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu4ESet;

    /**
     * The default value of the '{@link #getVucmax() <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVucmax()
     * @generated
     * @ordered
     */
    protected static final Float VUCMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVucmax() <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVucmax()
     * @generated
     * @ordered
     */
    protected Float vucmax = VUCMAX_EDEFAULT;

    /**
     * This is true if the Vucmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vucmaxESet;

    /**
     * The default value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected static final Float VUIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected Float vuimax = VUIMAX_EDEFAULT;

    /**
     * This is true if the Vuimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuimaxESet;

    /**
     * The default value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected static final Float VUIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected Float vuimin = VUIMIN_EDEFAULT;

    /**
     * This is true if the Vuimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuiminESet;

    /**
     * The default value of the '{@link #getVulmax() <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmax()
     * @generated
     * @ordered
     */
    protected static final Float VULMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVulmax() <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmax()
     * @generated
     * @ordered
     */
    protected Float vulmax = VULMAX_EDEFAULT;

    /**
     * This is true if the Vulmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vulmaxESet;

    /**
     * The default value of the '{@link #getVulmin() <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmin()
     * @generated
     * @ordered
     */
    protected static final Float VULMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVulmin() <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmin()
     * @generated
     * @ordered
     */
    protected Float vulmin = VULMIN_EDEFAULT;

    /**
     * This is true if the Vulmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vulminESet;

    /**
     * The default value of the '{@link #getVurmax() <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVurmax()
     * @generated
     * @ordered
     */
    protected static final Float VURMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVurmax() <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVurmax()
     * @generated
     * @ordered
     */
    protected Float vurmax = VURMAX_EDEFAULT;

    /**
     * This is true if the Vurmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vurmaxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnderexcLimIEEE1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUnderexcLimIEEE1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKuc() {
        return kuc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKuc( Float newKuc ) {
        Float oldKuc = kuc;
        kuc = newKuc;
        boolean oldKucESet = kucESet;
        kucESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUC, oldKuc, kuc, !oldKucESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKuc() {
        Float oldKuc = kuc;
        boolean oldKucESet = kucESet;
        kuc = KUC_EDEFAULT;
        kucESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUC, oldKuc, KUC_EDEFAULT, oldKucESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKuc() {
        return kucESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKuf() {
        return kuf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKuf( Float newKuf ) {
        Float oldKuf = kuf;
        kuf = newKuf;
        boolean oldKufESet = kufESet;
        kufESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUF, oldKuf, kuf, !oldKufESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKuf() {
        Float oldKuf = kuf;
        boolean oldKufESet = kufESet;
        kuf = KUF_EDEFAULT;
        kufESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUF, oldKuf, KUF_EDEFAULT, oldKufESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKuf() {
        return kufESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKui() {
        return kui;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKui( Float newKui ) {
        Float oldKui = kui;
        kui = newKui;
        boolean oldKuiESet = kuiESet;
        kuiESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUI, oldKui, kui, !oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKui() {
        Float oldKui = kui;
        boolean oldKuiESet = kuiESet;
        kui = KUI_EDEFAULT;
        kuiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUI, oldKui, KUI_EDEFAULT, oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKui() {
        return kuiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKul() {
        return kul;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKul( Float newKul ) {
        Float oldKul = kul;
        kul = newKul;
        boolean oldKulESet = kulESet;
        kulESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUL, oldKul, kul, !oldKulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKul() {
        Float oldKul = kul;
        boolean oldKulESet = kulESet;
        kul = KUL_EDEFAULT;
        kulESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUL, oldKul, KUL_EDEFAULT, oldKulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKul() {
        return kulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKur() {
        return kur;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKur( Float newKur ) {
        Float oldKur = kur;
        kur = newKur;
        boolean oldKurESet = kurESet;
        kurESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUR, oldKur, kur, !oldKurESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKur() {
        Float oldKur = kur;
        boolean oldKurESet = kurESet;
        kur = KUR_EDEFAULT;
        kurESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__KUR, oldKur, KUR_EDEFAULT, oldKurESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKur() {
        return kurESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu1() {
        return tu1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu1( Float newTu1 ) {
        Float oldTu1 = tu1;
        tu1 = newTu1;
        boolean oldTu1ESet = tu1ESet;
        tu1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU1, oldTu1, tu1, !oldTu1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu1() {
        Float oldTu1 = tu1;
        boolean oldTu1ESet = tu1ESet;
        tu1 = TU1_EDEFAULT;
        tu1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU1, oldTu1, TU1_EDEFAULT, oldTu1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu1() {
        return tu1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu2() {
        return tu2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu2( Float newTu2 ) {
        Float oldTu2 = tu2;
        tu2 = newTu2;
        boolean oldTu2ESet = tu2ESet;
        tu2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU2, oldTu2, tu2, !oldTu2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu2() {
        Float oldTu2 = tu2;
        boolean oldTu2ESet = tu2ESet;
        tu2 = TU2_EDEFAULT;
        tu2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU2, oldTu2, TU2_EDEFAULT, oldTu2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu2() {
        return tu2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu3() {
        return tu3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu3( Float newTu3 ) {
        Float oldTu3 = tu3;
        tu3 = newTu3;
        boolean oldTu3ESet = tu3ESet;
        tu3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU3, oldTu3, tu3, !oldTu3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu3() {
        Float oldTu3 = tu3;
        boolean oldTu3ESet = tu3ESet;
        tu3 = TU3_EDEFAULT;
        tu3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU3, oldTu3, TU3_EDEFAULT, oldTu3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu3() {
        return tu3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu4() {
        return tu4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu4( Float newTu4 ) {
        Float oldTu4 = tu4;
        tu4 = newTu4;
        boolean oldTu4ESet = tu4ESet;
        tu4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU4, oldTu4, tu4, !oldTu4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu4() {
        Float oldTu4 = tu4;
        boolean oldTu4ESet = tu4ESet;
        tu4 = TU4_EDEFAULT;
        tu4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__TU4, oldTu4, TU4_EDEFAULT, oldTu4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu4() {
        return tu4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVucmax() {
        return vucmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVucmax( Float newVucmax ) {
        Float oldVucmax = vucmax;
        vucmax = newVucmax;
        boolean oldVucmaxESet = vucmaxESet;
        vucmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX, oldVucmax, vucmax, !oldVucmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVucmax() {
        Float oldVucmax = vucmax;
        boolean oldVucmaxESet = vucmaxESet;
        vucmax = VUCMAX_EDEFAULT;
        vucmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX, oldVucmax, VUCMAX_EDEFAULT, oldVucmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVucmax() {
        return vucmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimax() {
        return vuimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimax( Float newVuimax ) {
        Float oldVuimax = vuimax;
        vuimax = newVuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX, oldVuimax, vuimax, !oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimax() {
        Float oldVuimax = vuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimax = VUIMAX_EDEFAULT;
        vuimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX, oldVuimax, VUIMAX_EDEFAULT, oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimax() {
        return vuimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimin() {
        return vuimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimin( Float newVuimin ) {
        Float oldVuimin = vuimin;
        vuimin = newVuimin;
        boolean oldVuiminESet = vuiminESet;
        vuiminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN, oldVuimin, vuimin, !oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimin() {
        Float oldVuimin = vuimin;
        boolean oldVuiminESet = vuiminESet;
        vuimin = VUIMIN_EDEFAULT;
        vuiminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN, oldVuimin, VUIMIN_EDEFAULT, oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimin() {
        return vuiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVulmax() {
        return vulmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVulmax( Float newVulmax ) {
        Float oldVulmax = vulmax;
        vulmax = newVulmax;
        boolean oldVulmaxESet = vulmaxESet;
        vulmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VULMAX, oldVulmax, vulmax, !oldVulmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVulmax() {
        Float oldVulmax = vulmax;
        boolean oldVulmaxESet = vulmaxESet;
        vulmax = VULMAX_EDEFAULT;
        vulmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VULMAX, oldVulmax, VULMAX_EDEFAULT, oldVulmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVulmax() {
        return vulmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVulmin() {
        return vulmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVulmin( Float newVulmin ) {
        Float oldVulmin = vulmin;
        vulmin = newVulmin;
        boolean oldVulminESet = vulminESet;
        vulminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VULMIN, oldVulmin, vulmin, !oldVulminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVulmin() {
        Float oldVulmin = vulmin;
        boolean oldVulminESet = vulminESet;
        vulmin = VULMIN_EDEFAULT;
        vulminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VULMIN, oldVulmin, VULMIN_EDEFAULT, oldVulminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVulmin() {
        return vulminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVurmax() {
        return vurmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVurmax( Float newVurmax ) {
        Float oldVurmax = vurmax;
        vurmax = newVurmax;
        boolean oldVurmaxESet = vurmaxESet;
        vurmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE1__VURMAX, oldVurmax, vurmax, !oldVurmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVurmax() {
        Float oldVurmax = vurmax;
        boolean oldVurmaxESet = vurmaxESet;
        vurmax = VURMAX_EDEFAULT;
        vurmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE1__VURMAX, oldVurmax, VURMAX_EDEFAULT, oldVurmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVurmax() {
        return vurmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.UNDEREXC_LIM_IEEE1__KUC:
            return getKuc();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUF:
            return getKuf();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUI:
            return getKui();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUL:
            return getKul();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUR:
            return getKur();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU1:
            return getTu1();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU2:
            return getTu2();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU3:
            return getTu3();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU4:
            return getTu4();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX:
            return getVucmax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX:
            return getVuimax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN:
            return getVuimin();
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMAX:
            return getVulmax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMIN:
            return getVulmin();
        case CimPackage.UNDEREXC_LIM_IEEE1__VURMAX:
            return getVurmax();
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
        case CimPackage.UNDEREXC_LIM_IEEE1__KUC:
            setKuc( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUF:
            setKuf( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUI:
            setKui( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUL:
            setKul( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUR:
            setKur( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU1:
            setTu1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU2:
            setTu2( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU3:
            setTu3( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU4:
            setTu4( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX:
            setVucmax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX:
            setVuimax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN:
            setVuimin( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMAX:
            setVulmax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMIN:
            setVulmin( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VURMAX:
            setVurmax( ( Float ) newValue );
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
        case CimPackage.UNDEREXC_LIM_IEEE1__KUC:
            unsetKuc();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUF:
            unsetKuf();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUI:
            unsetKui();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUL:
            unsetKul();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__KUR:
            unsetKur();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU1:
            unsetTu1();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU2:
            unsetTu2();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU3:
            unsetTu3();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__TU4:
            unsetTu4();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX:
            unsetVucmax();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX:
            unsetVuimax();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN:
            unsetVuimin();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMAX:
            unsetVulmax();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMIN:
            unsetVulmin();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE1__VURMAX:
            unsetVurmax();
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
        case CimPackage.UNDEREXC_LIM_IEEE1__KUC:
            return isSetKuc();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUF:
            return isSetKuf();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUI:
            return isSetKui();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUL:
            return isSetKul();
        case CimPackage.UNDEREXC_LIM_IEEE1__KUR:
            return isSetKur();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU1:
            return isSetTu1();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU2:
            return isSetTu2();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU3:
            return isSetTu3();
        case CimPackage.UNDEREXC_LIM_IEEE1__TU4:
            return isSetTu4();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX:
            return isSetVucmax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX:
            return isSetVuimax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN:
            return isSetVuimin();
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMAX:
            return isSetVulmax();
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMIN:
            return isSetVulmin();
        case CimPackage.UNDEREXC_LIM_IEEE1__VURMAX:
            return isSetVurmax();
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
        result.append( " (kuc: " );
        if( kucESet )
            result.append( kuc );
        else
            result.append( "<unset>" );
        result.append( ", kuf: " );
        if( kufESet )
            result.append( kuf );
        else
            result.append( "<unset>" );
        result.append( ", kui: " );
        if( kuiESet )
            result.append( kui );
        else
            result.append( "<unset>" );
        result.append( ", kul: " );
        if( kulESet )
            result.append( kul );
        else
            result.append( "<unset>" );
        result.append( ", kur: " );
        if( kurESet )
            result.append( kur );
        else
            result.append( "<unset>" );
        result.append( ", tu1: " );
        if( tu1ESet )
            result.append( tu1 );
        else
            result.append( "<unset>" );
        result.append( ", tu2: " );
        if( tu2ESet )
            result.append( tu2 );
        else
            result.append( "<unset>" );
        result.append( ", tu3: " );
        if( tu3ESet )
            result.append( tu3 );
        else
            result.append( "<unset>" );
        result.append( ", tu4: " );
        if( tu4ESet )
            result.append( tu4 );
        else
            result.append( "<unset>" );
        result.append( ", vucmax: " );
        if( vucmaxESet )
            result.append( vucmax );
        else
            result.append( "<unset>" );
        result.append( ", vuimax: " );
        if( vuimaxESet )
            result.append( vuimax );
        else
            result.append( "<unset>" );
        result.append( ", vuimin: " );
        if( vuiminESet )
            result.append( vuimin );
        else
            result.append( "<unset>" );
        result.append( ", vulmax: " );
        if( vulmaxESet )
            result.append( vulmax );
        else
            result.append( "<unset>" );
        result.append( ", vulmin: " );
        if( vulminESet )
            result.append( vulmin );
        else
            result.append( "<unset>" );
        result.append( ", vurmax: " );
        if( vurmaxESet )
            result.append( vurmax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UnderexcLimIEEE1Impl
