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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST4B;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ST4B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKim <em>Kim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKir <em>Kir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getKpr <em>Kpr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getLvgate <em>Lvgate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getThetap <em>Thetap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getUel <em>Uel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVbmax <em>Vbmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVgmax <em>Vgmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVmmax <em>Vmmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVmmin <em>Vmmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST4BImpl#getXl <em>Xl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcST4BImpl extends ExcitationSystemDynamicsImpl implements ExcST4B {
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
     * The default value of the '{@link #getKim() <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKim()
     * @generated
     * @ordered
     */
    protected static final Float KIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKim() <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKim()
     * @generated
     * @ordered
     */
    protected Float kim = KIM_EDEFAULT;

    /**
     * This is true if the Kim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kimESet;

    /**
     * The default value of the '{@link #getKir() <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKir()
     * @generated
     * @ordered
     */
    protected static final Float KIR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKir() <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKir()
     * @generated
     * @ordered
     */
    protected Float kir = KIR_EDEFAULT;

    /**
     * This is true if the Kir attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kirESet;

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
     * The default value of the '{@link #getKpm() <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpm()
     * @generated
     * @ordered
     */
    protected static final Float KPM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpm() <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpm()
     * @generated
     * @ordered
     */
    protected Float kpm = KPM_EDEFAULT;

    /**
     * This is true if the Kpm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpmESet;

    /**
     * The default value of the '{@link #getKpr() <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpr()
     * @generated
     * @ordered
     */
    protected static final Float KPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpr() <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpr()
     * @generated
     * @ordered
     */
    protected Float kpr = KPR_EDEFAULT;

    /**
     * This is true if the Kpr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kprESet;

    /**
     * The default value of the '{@link #getLvgate() <em>Lvgate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLvgate()
     * @generated
     * @ordered
     */
    protected static final Boolean LVGATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLvgate() <em>Lvgate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLvgate()
     * @generated
     * @ordered
     */
    protected Boolean lvgate = LVGATE_EDEFAULT;

    /**
     * This is true if the Lvgate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lvgateESet;

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
     * The default value of the '{@link #getUel() <em>Uel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUel()
     * @generated
     * @ordered
     */
    protected static final Boolean UEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUel() <em>Uel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUel()
     * @generated
     * @ordered
     */
    protected Boolean uel = UEL_EDEFAULT;

    /**
     * This is true if the Uel attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uelESet;

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
    protected ExcST4BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcST4B();
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KC, oldKc, kc, !oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__KC,
                oldKc, KC_EDEFAULT, oldKcESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KG, oldKg, kg, !oldKgESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__KG,
                oldKg, KG_EDEFAULT, oldKgESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KI, oldKi, ki, !oldKiESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__KI,
                oldKi, KI_EDEFAULT, oldKiESet ) );
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
    public Float getKim() {
        return kim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKim( Float newKim ) {
        Float oldKim = kim;
        kim = newKim;
        boolean oldKimESet = kimESet;
        kimESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KIM, oldKim, kim, !oldKimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKim() {
        Float oldKim = kim;
        boolean oldKimESet = kimESet;
        kim = KIM_EDEFAULT;
        kimESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__KIM, oldKim, KIM_EDEFAULT, oldKimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKim() {
        return kimESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKir() {
        return kir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKir( Float newKir ) {
        Float oldKir = kir;
        kir = newKir;
        boolean oldKirESet = kirESet;
        kirESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KIR, oldKir, kir, !oldKirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKir() {
        Float oldKir = kir;
        boolean oldKirESet = kirESet;
        kir = KIR_EDEFAULT;
        kirESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__KIR, oldKir, KIR_EDEFAULT, oldKirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKir() {
        return kirESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KP, oldKp, kp, !oldKpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__KP,
                oldKp, KP_EDEFAULT, oldKpESet ) );
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
    public Float getKpm() {
        return kpm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpm( Float newKpm ) {
        Float oldKpm = kpm;
        kpm = newKpm;
        boolean oldKpmESet = kpmESet;
        kpmESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KPM, oldKpm, kpm, !oldKpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpm() {
        Float oldKpm = kpm;
        boolean oldKpmESet = kpmESet;
        kpm = KPM_EDEFAULT;
        kpmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__KPM, oldKpm, KPM_EDEFAULT, oldKpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpm() {
        return kpmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpr() {
        return kpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpr( Float newKpr ) {
        Float oldKpr = kpr;
        kpr = newKpr;
        boolean oldKprESet = kprESet;
        kprESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__KPR, oldKpr, kpr, !oldKprESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpr() {
        Float oldKpr = kpr;
        boolean oldKprESet = kprESet;
        kpr = KPR_EDEFAULT;
        kprESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__KPR, oldKpr, KPR_EDEFAULT, oldKprESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpr() {
        return kprESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getLvgate() {
        return lvgate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLvgate( Boolean newLvgate ) {
        Boolean oldLvgate = lvgate;
        lvgate = newLvgate;
        boolean oldLvgateESet = lvgateESet;
        lvgateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST4B__LVGATE, oldLvgate, lvgate, !oldLvgateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLvgate() {
        Boolean oldLvgate = lvgate;
        boolean oldLvgateESet = lvgateESet;
        lvgate = LVGATE_EDEFAULT;
        lvgateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__LVGATE, oldLvgate, LVGATE_EDEFAULT, oldLvgateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLvgate() {
        return lvgateESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__TA, oldTa, ta, !oldTaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__TA,
                oldTa, TA_EDEFAULT, oldTaESet ) );
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
                CimPackage.EXC_ST4B__THETAP, oldThetap, thetap, !oldThetapESet ) );
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
                CimPackage.EXC_ST4B__THETAP, oldThetap, THETAP_EDEFAULT, oldThetapESet ) );
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
    public Boolean getUel() {
        return uel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUel( Boolean newUel ) {
        Boolean oldUel = uel;
        uel = newUel;
        boolean oldUelESet = uelESet;
        uelESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__UEL, oldUel, uel, !oldUelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUel() {
        Boolean oldUel = uel;
        boolean oldUelESet = uelESet;
        uel = UEL_EDEFAULT;
        uelESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST4B__UEL, oldUel, UEL_EDEFAULT, oldUelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUel() {
        return uelESet;
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
                CimPackage.EXC_ST4B__VBMAX, oldVbmax, vbmax, !oldVbmaxESet ) );
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
                CimPackage.EXC_ST4B__VBMAX, oldVbmax, VBMAX_EDEFAULT, oldVbmaxESet ) );
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
                CimPackage.EXC_ST4B__VGMAX, oldVgmax, vgmax, !oldVgmaxESet ) );
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
                CimPackage.EXC_ST4B__VGMAX, oldVgmax, VGMAX_EDEFAULT, oldVgmaxESet ) );
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
                CimPackage.EXC_ST4B__VMMAX, oldVmmax, vmmax, !oldVmmaxESet ) );
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
                CimPackage.EXC_ST4B__VMMAX, oldVmmax, VMMAX_EDEFAULT, oldVmmaxESet ) );
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
                CimPackage.EXC_ST4B__VMMIN, oldVmmin, vmmin, !oldVmminESet ) );
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
                CimPackage.EXC_ST4B__VMMIN, oldVmmin, VMMIN_EDEFAULT, oldVmminESet ) );
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
                CimPackage.EXC_ST4B__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_ST4B__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
                CimPackage.EXC_ST4B__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_ST4B__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST4B__XL, oldXl, xl, !oldXlESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST4B__XL,
                oldXl, XL_EDEFAULT, oldXlESet ) );
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
        case CimPackage.EXC_ST4B__KC:
            return getKc();
        case CimPackage.EXC_ST4B__KG:
            return getKg();
        case CimPackage.EXC_ST4B__KI:
            return getKi();
        case CimPackage.EXC_ST4B__KIM:
            return getKim();
        case CimPackage.EXC_ST4B__KIR:
            return getKir();
        case CimPackage.EXC_ST4B__KP:
            return getKp();
        case CimPackage.EXC_ST4B__KPM:
            return getKpm();
        case CimPackage.EXC_ST4B__KPR:
            return getKpr();
        case CimPackage.EXC_ST4B__LVGATE:
            return getLvgate();
        case CimPackage.EXC_ST4B__TA:
            return getTa();
        case CimPackage.EXC_ST4B__THETAP:
            return getThetap();
        case CimPackage.EXC_ST4B__UEL:
            return getUel();
        case CimPackage.EXC_ST4B__VBMAX:
            return getVbmax();
        case CimPackage.EXC_ST4B__VGMAX:
            return getVgmax();
        case CimPackage.EXC_ST4B__VMMAX:
            return getVmmax();
        case CimPackage.EXC_ST4B__VMMIN:
            return getVmmin();
        case CimPackage.EXC_ST4B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_ST4B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_ST4B__XL:
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
        case CimPackage.EXC_ST4B__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KG:
            setKg( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KIM:
            setKim( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KIR:
            setKir( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KPM:
            setKpm( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__KPR:
            setKpr( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__LVGATE:
            setLvgate( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST4B__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__THETAP:
            setThetap( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__UEL:
            setUel( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST4B__VBMAX:
            setVbmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__VGMAX:
            setVgmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__VMMAX:
            setVmmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__VMMIN:
            setVmmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__VRMIN:
            setVrmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST4B__XL:
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
        case CimPackage.EXC_ST4B__KC:
            unsetKc();
            return;
        case CimPackage.EXC_ST4B__KG:
            unsetKg();
            return;
        case CimPackage.EXC_ST4B__KI:
            unsetKi();
            return;
        case CimPackage.EXC_ST4B__KIM:
            unsetKim();
            return;
        case CimPackage.EXC_ST4B__KIR:
            unsetKir();
            return;
        case CimPackage.EXC_ST4B__KP:
            unsetKp();
            return;
        case CimPackage.EXC_ST4B__KPM:
            unsetKpm();
            return;
        case CimPackage.EXC_ST4B__KPR:
            unsetKpr();
            return;
        case CimPackage.EXC_ST4B__LVGATE:
            unsetLvgate();
            return;
        case CimPackage.EXC_ST4B__TA:
            unsetTa();
            return;
        case CimPackage.EXC_ST4B__THETAP:
            unsetThetap();
            return;
        case CimPackage.EXC_ST4B__UEL:
            unsetUel();
            return;
        case CimPackage.EXC_ST4B__VBMAX:
            unsetVbmax();
            return;
        case CimPackage.EXC_ST4B__VGMAX:
            unsetVgmax();
            return;
        case CimPackage.EXC_ST4B__VMMAX:
            unsetVmmax();
            return;
        case CimPackage.EXC_ST4B__VMMIN:
            unsetVmmin();
            return;
        case CimPackage.EXC_ST4B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_ST4B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_ST4B__XL:
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
        case CimPackage.EXC_ST4B__KC:
            return isSetKc();
        case CimPackage.EXC_ST4B__KG:
            return isSetKg();
        case CimPackage.EXC_ST4B__KI:
            return isSetKi();
        case CimPackage.EXC_ST4B__KIM:
            return isSetKim();
        case CimPackage.EXC_ST4B__KIR:
            return isSetKir();
        case CimPackage.EXC_ST4B__KP:
            return isSetKp();
        case CimPackage.EXC_ST4B__KPM:
            return isSetKpm();
        case CimPackage.EXC_ST4B__KPR:
            return isSetKpr();
        case CimPackage.EXC_ST4B__LVGATE:
            return isSetLvgate();
        case CimPackage.EXC_ST4B__TA:
            return isSetTa();
        case CimPackage.EXC_ST4B__THETAP:
            return isSetThetap();
        case CimPackage.EXC_ST4B__UEL:
            return isSetUel();
        case CimPackage.EXC_ST4B__VBMAX:
            return isSetVbmax();
        case CimPackage.EXC_ST4B__VGMAX:
            return isSetVgmax();
        case CimPackage.EXC_ST4B__VMMAX:
            return isSetVmmax();
        case CimPackage.EXC_ST4B__VMMIN:
            return isSetVmmin();
        case CimPackage.EXC_ST4B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_ST4B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_ST4B__XL:
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
        result.append( " (kc: " );
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
        result.append( ", kim: " );
        if( kimESet )
            result.append( kim );
        else
            result.append( "<unset>" );
        result.append( ", kir: " );
        if( kirESet )
            result.append( kir );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", kpm: " );
        if( kpmESet )
            result.append( kpm );
        else
            result.append( "<unset>" );
        result.append( ", kpr: " );
        if( kprESet )
            result.append( kpr );
        else
            result.append( "<unset>" );
        result.append( ", lvgate: " );
        if( lvgateESet )
            result.append( lvgate );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", thetap: " );
        if( thetapESet )
            result.append( thetap );
        else
            result.append( "<unset>" );
        result.append( ", uel: " );
        if( uelESet )
            result.append( uel );
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

} //ExcST4BImpl
