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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST2A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ST2A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getEfdmax <em>Efdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getUelin <em>Uelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST2AImpl#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcST2AImpl extends ExcitationSystemDynamicsImpl implements ExcST2A {
    /**
     * The default value of the '{@link #getEfdmax() <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmax()
     * @generated
     * @ordered
     */
    protected static final Float EFDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdmax() <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmax()
     * @generated
     * @ordered
     */
    protected Float efdmax = EFDMAX_EDEFAULT;

    /**
     * This is true if the Efdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdmaxESet;

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
     * The default value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected static final Float KE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected Float ke = KE_EDEFAULT;

    /**
     * This is true if the Ke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keESet;

    /**
     * The default value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected static final Float KF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected Float kf = KF_EDEFAULT;

    /**
     * This is true if the Kf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfESet;

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
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Float TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Float te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

    /**
     * The default value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected static final Float TF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected Float tf = TF_EDEFAULT;

    /**
     * This is true if the Tf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfESet;

    /**
     * The default value of the '{@link #getUelin() <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUelin()
     * @generated
     * @ordered
     */
    protected static final Boolean UELIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUelin() <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUelin()
     * @generated
     * @ordered
     */
    protected Boolean uelin = UELIN_EDEFAULT;

    /**
     * This is true if the Uelin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uelinESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcST2AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcST2A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdmax() {
        return efdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdmax( Float newEfdmax ) {
        Float oldEfdmax = efdmax;
        efdmax = newEfdmax;
        boolean oldEfdmaxESet = efdmaxESet;
        efdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST2A__EFDMAX, oldEfdmax, efdmax, !oldEfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdmax() {
        Float oldEfdmax = efdmax;
        boolean oldEfdmaxESet = efdmaxESet;
        efdmax = EFDMAX_EDEFAULT;
        efdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST2A__EFDMAX, oldEfdmax, EFDMAX_EDEFAULT, oldEfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdmax() {
        return efdmaxESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KA, oldKa, ka, !oldKaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KA,
                oldKa, KA_EDEFAULT, oldKaESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KC, oldKc, kc, !oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KC,
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
    public Float getKe() {
        return ke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe( Float newKe ) {
        Float oldKe = ke;
        ke = newKe;
        boolean oldKeESet = keESet;
        keESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KE, oldKe, ke, !oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe() {
        Float oldKe = ke;
        boolean oldKeESet = keESet;
        ke = KE_EDEFAULT;
        keESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KE,
                oldKe, KE_EDEFAULT, oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe() {
        return keESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKf() {
        return kf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf( Float newKf ) {
        Float oldKf = kf;
        kf = newKf;
        boolean oldKfESet = kfESet;
        kfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KF, oldKf, kf, !oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf() {
        Float oldKf = kf;
        boolean oldKfESet = kfESet;
        kf = KF_EDEFAULT;
        kfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KF,
                oldKf, KF_EDEFAULT, oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf() {
        return kfESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KI, oldKi, ki, !oldKiESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KI,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__KP, oldKp, kp, !oldKpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__KP,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__TA, oldTa, ta, !oldTaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__TA,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__TB, oldTb, tb, !oldTbESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__TB,
                oldTb, TB_EDEFAULT, oldTbESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__TC, oldTc, tc, !oldTcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__TC,
                oldTc, TC_EDEFAULT, oldTcESet ) );
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
    public Float getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Float newTe ) {
        Float oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Float oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__TE,
                oldTe, TE_EDEFAULT, oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf() {
        return tf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf( Float newTf ) {
        Float oldTf = tf;
        tf = newTf;
        boolean oldTfESet = tfESet;
        tfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST2A__TF, oldTf, tf, !oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf() {
        Float oldTf = tf;
        boolean oldTfESet = tfESet;
        tf = TF_EDEFAULT;
        tfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST2A__TF,
                oldTf, TF_EDEFAULT, oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf() {
        return tfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getUelin() {
        return uelin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUelin( Boolean newUelin ) {
        Boolean oldUelin = uelin;
        uelin = newUelin;
        boolean oldUelinESet = uelinESet;
        uelinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST2A__UELIN, oldUelin, uelin, !oldUelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUelin() {
        Boolean oldUelin = uelin;
        boolean oldUelinESet = uelinESet;
        uelin = UELIN_EDEFAULT;
        uelinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST2A__UELIN, oldUelin, UELIN_EDEFAULT, oldUelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUelin() {
        return uelinESet;
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
                CimPackage.EXC_ST2A__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_ST2A__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
                CimPackage.EXC_ST2A__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_ST2A__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_ST2A__EFDMAX:
            return getEfdmax();
        case CimPackage.EXC_ST2A__KA:
            return getKa();
        case CimPackage.EXC_ST2A__KC:
            return getKc();
        case CimPackage.EXC_ST2A__KE:
            return getKe();
        case CimPackage.EXC_ST2A__KF:
            return getKf();
        case CimPackage.EXC_ST2A__KI:
            return getKi();
        case CimPackage.EXC_ST2A__KP:
            return getKp();
        case CimPackage.EXC_ST2A__TA:
            return getTa();
        case CimPackage.EXC_ST2A__TB:
            return getTb();
        case CimPackage.EXC_ST2A__TC:
            return getTc();
        case CimPackage.EXC_ST2A__TE:
            return getTe();
        case CimPackage.EXC_ST2A__TF:
            return getTf();
        case CimPackage.EXC_ST2A__UELIN:
            return getUelin();
        case CimPackage.EXC_ST2A__VRMAX:
            return getVrmax();
        case CimPackage.EXC_ST2A__VRMIN:
            return getVrmin();
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
        case CimPackage.EXC_ST2A__EFDMAX:
            setEfdmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__UELIN:
            setUelin( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST2A__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST2A__VRMIN:
            setVrmin( ( Float ) newValue );
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
        case CimPackage.EXC_ST2A__EFDMAX:
            unsetEfdmax();
            return;
        case CimPackage.EXC_ST2A__KA:
            unsetKa();
            return;
        case CimPackage.EXC_ST2A__KC:
            unsetKc();
            return;
        case CimPackage.EXC_ST2A__KE:
            unsetKe();
            return;
        case CimPackage.EXC_ST2A__KF:
            unsetKf();
            return;
        case CimPackage.EXC_ST2A__KI:
            unsetKi();
            return;
        case CimPackage.EXC_ST2A__KP:
            unsetKp();
            return;
        case CimPackage.EXC_ST2A__TA:
            unsetTa();
            return;
        case CimPackage.EXC_ST2A__TB:
            unsetTb();
            return;
        case CimPackage.EXC_ST2A__TC:
            unsetTc();
            return;
        case CimPackage.EXC_ST2A__TE:
            unsetTe();
            return;
        case CimPackage.EXC_ST2A__TF:
            unsetTf();
            return;
        case CimPackage.EXC_ST2A__UELIN:
            unsetUelin();
            return;
        case CimPackage.EXC_ST2A__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_ST2A__VRMIN:
            unsetVrmin();
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
        case CimPackage.EXC_ST2A__EFDMAX:
            return isSetEfdmax();
        case CimPackage.EXC_ST2A__KA:
            return isSetKa();
        case CimPackage.EXC_ST2A__KC:
            return isSetKc();
        case CimPackage.EXC_ST2A__KE:
            return isSetKe();
        case CimPackage.EXC_ST2A__KF:
            return isSetKf();
        case CimPackage.EXC_ST2A__KI:
            return isSetKi();
        case CimPackage.EXC_ST2A__KP:
            return isSetKp();
        case CimPackage.EXC_ST2A__TA:
            return isSetTa();
        case CimPackage.EXC_ST2A__TB:
            return isSetTb();
        case CimPackage.EXC_ST2A__TC:
            return isSetTc();
        case CimPackage.EXC_ST2A__TE:
            return isSetTe();
        case CimPackage.EXC_ST2A__TF:
            return isSetTf();
        case CimPackage.EXC_ST2A__UELIN:
            return isSetUelin();
        case CimPackage.EXC_ST2A__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_ST2A__VRMIN:
            return isSetVrmin();
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
        result.append( " (efdmax: " );
        if( efdmaxESet )
            result.append( efdmax );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
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
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", uelin: " );
        if( uelinESet )
            result.append( uelin );
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
        result.append( ')' );
        return result.toString();
    }

} //ExcST2AImpl
