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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST3A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEST3A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getThetap <em>Thetap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVbmax <em>Vbmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVgmax <em>Vgmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVimin <em>Vimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVmmax <em>Vmmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVmmin <em>Vmmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST3AImpl#getXl <em>Xl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEST3AImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEST3A {
    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Float KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Float ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected static final Float KC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected Float kc = KC_EDEFAULT;

    /**
     * This is true if the Kc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcESet;

    /**
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Float KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Float kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Float KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Float ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

    /**
     * The default value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected static final Float KM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected Float km = KM_EDEFAULT;

    /**
     * This is true if the Km attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmESet;

    /**
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Float KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Float kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

    /**
     * The default value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected static final Float TA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected Float ta = TA_EDEFAULT;

    /**
     * This is true if the Ta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Float TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Float tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected static final Float TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected Float tc = TC_EDEFAULT;

    /**
     * This is true if the Tc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcESet;

    /**
     * The default value of the '{@link #getThetap() <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetap()
     * @generated
     * @ordered
     */
    protected static final Float THETAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetap() <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetap()
     * @generated
     * @ordered
     */
    protected Float thetap = THETAP_EDEFAULT;

    /**
     * This is true if the Thetap attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetapESet;

    /**
     * The default value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected static final Float TM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected Float tm = TM_EDEFAULT;

    /**
     * This is true if the Tm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmESet;

    /**
     * The default value of the '{@link #getVbmax() <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVbmax()
     * @generated
     * @ordered
     */
    protected static final Float VBMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVbmax() <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVbmax()
     * @generated
     * @ordered
     */
    protected Float vbmax = VBMAX_EDEFAULT;

    /**
     * This is true if the Vbmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vbmaxESet;

    /**
     * The default value of the '{@link #getVgmax() <em>Vgmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVgmax()
     * @generated
     * @ordered
     */
    protected static final Float VGMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVgmax() <em>Vgmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVgmax()
     * @generated
     * @ordered
     */
    protected Float vgmax = VGMAX_EDEFAULT;

    /**
     * This is true if the Vgmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vgmaxESet;

    /**
     * The default value of the '{@link #getVimax() <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimax()
     * @generated
     * @ordered
     */
    protected static final Float VIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVimax() <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimax()
     * @generated
     * @ordered
     */
    protected Float vimax = VIMAX_EDEFAULT;

    /**
     * This is true if the Vimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vimaxESet;

    /**
     * The default value of the '{@link #getVimin() <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimin()
     * @generated
     * @ordered
     */
    protected static final Float VIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVimin() <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimin()
     * @generated
     * @ordered
     */
    protected Float vimin = VIMIN_EDEFAULT;

    /**
     * This is true if the Vimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean viminESet;

    /**
     * The default value of the '{@link #getVmmax() <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmax()
     * @generated
     * @ordered
     */
    protected static final Float VMMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmmax() <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmax()
     * @generated
     * @ordered
     */
    protected Float vmmax = VMMAX_EDEFAULT;

    /**
     * This is true if the Vmmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmmaxESet;

    /**
     * The default value of the '{@link #getVmmin() <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmin()
     * @generated
     * @ordered
     */
    protected static final Float VMMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmmin() <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmin()
     * @generated
     * @ordered
     */
    protected Float vmmin = VMMIN_EDEFAULT;

    /**
     * This is true if the Vmmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmminESet;

    /**
     * The default value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected static final Float VRMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected Float vrmax = VRMAX_EDEFAULT;

    /**
     * This is true if the Vrmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmaxESet;

    /**
     * The default value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected static final Float VRMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected Float vrmin = VRMIN_EDEFAULT;

    /**
     * This is true if the Vrmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrminESet;

    /**
     * The default value of the '{@link #getXl() <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXl()
     * @generated
     * @ordered
     */
    protected static final Float XL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXl() <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXl()
     * @generated
     * @ordered
     */
    protected Float xl = XL_EDEFAULT;

    /**
     * This is true if the Xl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEST3AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEST3A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Float newKa ) {
        Float oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KA, oldKa, ka, !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Float oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKc() {
        return kc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKc( Float newKc ) {
        Float oldKc = kc;
        kc = newKc;
        boolean oldKcESet = kcESet;
        kcESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KC, oldKc, kc, !oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKc() {
        Float oldKc = kc;
        boolean oldKcESet = kcESet;
        kc = KC_EDEFAULT;
        kcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KC, oldKc, KC_EDEFAULT, oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKc() {
        return kcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Float newKg ) {
        Float oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KG, oldKg, kg, !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Float oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KG, oldKg, KG_EDEFAULT, oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Float newKi ) {
        Float oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KI, oldKi, ki, !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Float oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKm() {
        return km;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKm( Float newKm ) {
        Float oldKm = km;
        km = newKm;
        boolean oldKmESet = kmESet;
        kmESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KM, oldKm, km, !oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKm() {
        Float oldKm = km;
        boolean oldKmESet = kmESet;
        km = KM_EDEFAULT;
        kmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KM, oldKm, KM_EDEFAULT, oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKm() {
        return kmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Float newKp ) {
        Float oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__KP, oldKp, kp, !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Float oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__KP, oldKp, KP_EDEFAULT, oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa() {
        return ta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa( Float newTa ) {
        Float oldTa = ta;
        ta = newTa;
        boolean oldTaESet = taESet;
        taESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__TA, oldTa, ta, !oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa() {
        Float oldTa = ta;
        boolean oldTaESet = taESet;
        ta = TA_EDEFAULT;
        taESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa() {
        return taESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Float newTb ) {
        Float oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Float oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__TB, oldTb, TB_EDEFAULT, oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTc() {
        return tc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc( Float newTc ) {
        Float oldTc = tc;
        tc = newTc;
        boolean oldTcESet = tcESet;
        tcESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__TC, oldTc, tc, !oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc() {
        Float oldTc = tc;
        boolean oldTcESet = tcESet;
        tc = TC_EDEFAULT;
        tcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc() {
        return tcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetap() {
        return thetap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetap( Float newThetap ) {
        Float oldThetap = thetap;
        thetap = newThetap;
        boolean oldThetapESet = thetapESet;
        thetapESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__THETAP, oldThetap, thetap, !oldThetapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetap() {
        Float oldThetap = thetap;
        boolean oldThetapESet = thetapESet;
        thetap = THETAP_EDEFAULT;
        thetapESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__THETAP, oldThetap, THETAP_EDEFAULT, oldThetapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetap() {
        return thetapESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTm() {
        return tm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTm( Float newTm ) {
        Float oldTm = tm;
        tm = newTm;
        boolean oldTmESet = tmESet;
        tmESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__TM, oldTm, tm, !oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTm() {
        Float oldTm = tm;
        boolean oldTmESet = tmESet;
        tm = TM_EDEFAULT;
        tmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__TM, oldTm, TM_EDEFAULT, oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTm() {
        return tmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVbmax() {
        return vbmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVbmax( Float newVbmax ) {
        Float oldVbmax = vbmax;
        vbmax = newVbmax;
        boolean oldVbmaxESet = vbmaxESet;
        vbmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VBMAX, oldVbmax, vbmax, !oldVbmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVbmax() {
        Float oldVbmax = vbmax;
        boolean oldVbmaxESet = vbmaxESet;
        vbmax = VBMAX_EDEFAULT;
        vbmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VBMAX, oldVbmax, VBMAX_EDEFAULT, oldVbmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVbmax() {
        return vbmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVgmax() {
        return vgmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVgmax( Float newVgmax ) {
        Float oldVgmax = vgmax;
        vgmax = newVgmax;
        boolean oldVgmaxESet = vgmaxESet;
        vgmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VGMAX, oldVgmax, vgmax, !oldVgmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVgmax() {
        Float oldVgmax = vgmax;
        boolean oldVgmaxESet = vgmaxESet;
        vgmax = VGMAX_EDEFAULT;
        vgmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VGMAX, oldVgmax, VGMAX_EDEFAULT, oldVgmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVgmax() {
        return vgmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVimax() {
        return vimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVimax( Float newVimax ) {
        Float oldVimax = vimax;
        vimax = newVimax;
        boolean oldVimaxESet = vimaxESet;
        vimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VIMAX, oldVimax, vimax, !oldVimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVimax() {
        Float oldVimax = vimax;
        boolean oldVimaxESet = vimaxESet;
        vimax = VIMAX_EDEFAULT;
        vimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VIMAX, oldVimax, VIMAX_EDEFAULT, oldVimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVimax() {
        return vimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVimin() {
        return vimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVimin( Float newVimin ) {
        Float oldVimin = vimin;
        vimin = newVimin;
        boolean oldViminESet = viminESet;
        viminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VIMIN, oldVimin, vimin, !oldViminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVimin() {
        Float oldVimin = vimin;
        boolean oldViminESet = viminESet;
        vimin = VIMIN_EDEFAULT;
        viminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VIMIN, oldVimin, VIMIN_EDEFAULT, oldViminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVimin() {
        return viminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVmmax() {
        return vmmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmmax( Float newVmmax ) {
        Float oldVmmax = vmmax;
        vmmax = newVmmax;
        boolean oldVmmaxESet = vmmaxESet;
        vmmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VMMAX, oldVmmax, vmmax, !oldVmmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmmax() {
        Float oldVmmax = vmmax;
        boolean oldVmmaxESet = vmmaxESet;
        vmmax = VMMAX_EDEFAULT;
        vmmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VMMAX, oldVmmax, VMMAX_EDEFAULT, oldVmmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmmax() {
        return vmmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVmmin() {
        return vmmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmmin( Float newVmmin ) {
        Float oldVmmin = vmmin;
        vmmin = newVmmin;
        boolean oldVmminESet = vmminESet;
        vmminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VMMIN, oldVmmin, vmmin, !oldVmminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmmin() {
        Float oldVmmin = vmmin;
        boolean oldVmminESet = vmminESet;
        vmmin = VMMIN_EDEFAULT;
        vmminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VMMIN, oldVmmin, VMMIN_EDEFAULT, oldVmminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmmin() {
        return vmminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmax() {
        return vrmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmax( Float newVrmax ) {
        Float oldVrmax = vrmax;
        vrmax = newVrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmax() {
        Float oldVrmax = vrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmax = VRMAX_EDEFAULT;
        vrmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmax() {
        return vrmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmin() {
        return vrmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmin( Float newVrmin ) {
        Float oldVrmin = vrmin;
        vrmin = newVrmin;
        boolean oldVrminESet = vrminESet;
        vrminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST3A__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmin() {
        Float oldVrmin = vrmin;
        boolean oldVrminESet = vrminESet;
        vrmin = VRMIN_EDEFAULT;
        vrminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmin() {
        return vrminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXl() {
        return xl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXl( Float newXl ) {
        Float oldXl = xl;
        xl = newXl;
        boolean oldXlESet = xlESet;
        xlESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST3A__XL, oldXl, xl, !oldXlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXl() {
        Float oldXl = xl;
        boolean oldXlESet = xlESet;
        xl = XL_EDEFAULT;
        xlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST3A__XL, oldXl, XL_EDEFAULT, oldXlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXl() {
        return xlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEST3A__KA:
            return getKa();
        case CimPackage.EXC_IEEEST3A__KC:
            return getKc();
        case CimPackage.EXC_IEEEST3A__KG:
            return getKg();
        case CimPackage.EXC_IEEEST3A__KI:
            return getKi();
        case CimPackage.EXC_IEEEST3A__KM:
            return getKm();
        case CimPackage.EXC_IEEEST3A__KP:
            return getKp();
        case CimPackage.EXC_IEEEST3A__TA:
            return getTa();
        case CimPackage.EXC_IEEEST3A__TB:
            return getTb();
        case CimPackage.EXC_IEEEST3A__TC:
            return getTc();
        case CimPackage.EXC_IEEEST3A__THETAP:
            return getThetap();
        case CimPackage.EXC_IEEEST3A__TM:
            return getTm();
        case CimPackage.EXC_IEEEST3A__VBMAX:
            return getVbmax();
        case CimPackage.EXC_IEEEST3A__VGMAX:
            return getVgmax();
        case CimPackage.EXC_IEEEST3A__VIMAX:
            return getVimax();
        case CimPackage.EXC_IEEEST3A__VIMIN:
            return getVimin();
        case CimPackage.EXC_IEEEST3A__VMMAX:
            return getVmmax();
        case CimPackage.EXC_IEEEST3A__VMMIN:
            return getVmmin();
        case CimPackage.EXC_IEEEST3A__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEST3A__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEST3A__XL:
            return getXl();
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
        case CimPackage.EXC_IEEEST3A__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__KG:
            setKg( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__KM:
            setKm( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__THETAP:
            setThetap( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__TM:
            setTm( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VBMAX:
            setVbmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VGMAX:
            setVgmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VIMAX:
            setVimax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VIMIN:
            setVimin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VMMAX:
            setVmmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VMMIN:
            setVmmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__VRMIN:
            setVrmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST3A__XL:
            setXl( ( Float ) newValue );
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
        case CimPackage.EXC_IEEEST3A__KA:
            unsetKa();
            return;
        case CimPackage.EXC_IEEEST3A__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEST3A__KG:
            unsetKg();
            return;
        case CimPackage.EXC_IEEEST3A__KI:
            unsetKi();
            return;
        case CimPackage.EXC_IEEEST3A__KM:
            unsetKm();
            return;
        case CimPackage.EXC_IEEEST3A__KP:
            unsetKp();
            return;
        case CimPackage.EXC_IEEEST3A__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEST3A__TB:
            unsetTb();
            return;
        case CimPackage.EXC_IEEEST3A__TC:
            unsetTc();
            return;
        case CimPackage.EXC_IEEEST3A__THETAP:
            unsetThetap();
            return;
        case CimPackage.EXC_IEEEST3A__TM:
            unsetTm();
            return;
        case CimPackage.EXC_IEEEST3A__VBMAX:
            unsetVbmax();
            return;
        case CimPackage.EXC_IEEEST3A__VGMAX:
            unsetVgmax();
            return;
        case CimPackage.EXC_IEEEST3A__VIMAX:
            unsetVimax();
            return;
        case CimPackage.EXC_IEEEST3A__VIMIN:
            unsetVimin();
            return;
        case CimPackage.EXC_IEEEST3A__VMMAX:
            unsetVmmax();
            return;
        case CimPackage.EXC_IEEEST3A__VMMIN:
            unsetVmmin();
            return;
        case CimPackage.EXC_IEEEST3A__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEST3A__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEST3A__XL:
            unsetXl();
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
        case CimPackage.EXC_IEEEST3A__KA:
            return isSetKa();
        case CimPackage.EXC_IEEEST3A__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEST3A__KG:
            return isSetKg();
        case CimPackage.EXC_IEEEST3A__KI:
            return isSetKi();
        case CimPackage.EXC_IEEEST3A__KM:
            return isSetKm();
        case CimPackage.EXC_IEEEST3A__KP:
            return isSetKp();
        case CimPackage.EXC_IEEEST3A__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEST3A__TB:
            return isSetTb();
        case CimPackage.EXC_IEEEST3A__TC:
            return isSetTc();
        case CimPackage.EXC_IEEEST3A__THETAP:
            return isSetThetap();
        case CimPackage.EXC_IEEEST3A__TM:
            return isSetTm();
        case CimPackage.EXC_IEEEST3A__VBMAX:
            return isSetVbmax();
        case CimPackage.EXC_IEEEST3A__VGMAX:
            return isSetVgmax();
        case CimPackage.EXC_IEEEST3A__VIMAX:
            return isSetVimax();
        case CimPackage.EXC_IEEEST3A__VIMIN:
            return isSetVimin();
        case CimPackage.EXC_IEEEST3A__VMMAX:
            return isSetVmmax();
        case CimPackage.EXC_IEEEST3A__VMMIN:
            return isSetVmmin();
        case CimPackage.EXC_IEEEST3A__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEST3A__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEST3A__XL:
            return isSetXl();
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
        result.append( " (ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", km: " );
        if( kmESet )
            result.append( km );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", thetap: " );
        if( thetapESet )
            result.append( thetap );
        else
            result.append( "<unset>" );
        result.append( ", tm: " );
        if( tmESet )
            result.append( tm );
        else
            result.append( "<unset>" );
        result.append( ", vbmax: " );
        if( vbmaxESet )
            result.append( vbmax );
        else
            result.append( "<unset>" );
        result.append( ", vgmax: " );
        if( vgmaxESet )
            result.append( vgmax );
        else
            result.append( "<unset>" );
        result.append( ", vimax: " );
        if( vimaxESet )
            result.append( vimax );
        else
            result.append( "<unset>" );
        result.append( ", vimin: " );
        if( viminESet )
            result.append( vimin );
        else
            result.append( "<unset>" );
        result.append( ", vmmax: " );
        if( vmmaxESet )
            result.append( vmmax );
        else
            result.append( "<unset>" );
        result.append( ", vmmin: " );
        if( vmminESet )
            result.append( vmmin );
        else
            result.append( "<unset>" );
        result.append( ", vrmax: " );
        if( vrmaxESet )
            result.append( vrmax );
        else
            result.append( "<unset>" );
        result.append( ", vrmin: " );
        if( vrminESet )
            result.append( vrmin );
        else
            result.append( "<unset>" );
        result.append( ", xl: " );
        if( xlESet )
            result.append( xl );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEST3AImpl
