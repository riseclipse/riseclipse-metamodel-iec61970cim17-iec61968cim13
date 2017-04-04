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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC3A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEAC3A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getEfdn <em>Efdn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKn <em>Kn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getKr <em>Kr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getSeve1 <em>Seve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getSeve2 <em>Seve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVamax <em>Vamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVamin <em>Vamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVe1 <em>Ve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVe2 <em>Ve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVemin <em>Vemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEAC3AImpl#getVfemax <em>Vfemax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEAC3AImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEAC3A {
    /**
     * The default value of the '{@link #getEfdn() <em>Efdn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdn()
     * @generated
     * @ordered
     */
    protected static final Float EFDN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdn() <em>Efdn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdn()
     * @generated
     * @ordered
     */
    protected Float efdn = EFDN_EDEFAULT;

    /**
     * This is true if the Efdn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdnESet;

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
     * The default value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected static final Float KD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected Float kd = KD_EDEFAULT;

    /**
     * This is true if the Kd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdESet;

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
     * The default value of the '{@link #getKn() <em>Kn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKn()
     * @generated
     * @ordered
     */
    protected static final Float KN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKn() <em>Kn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKn()
     * @generated
     * @ordered
     */
    protected Float kn = KN_EDEFAULT;

    /**
     * This is true if the Kn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean knESet;

    /**
     * The default value of the '{@link #getKr() <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKr()
     * @generated
     * @ordered
     */
    protected static final Float KR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKr() <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKr()
     * @generated
     * @ordered
     */
    protected Float kr = KR_EDEFAULT;

    /**
     * This is true if the Kr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krESet;

    /**
     * The default value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected static final Float SEVE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected Float seve1 = SEVE1_EDEFAULT;

    /**
     * This is true if the Seve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve1ESet;

    /**
     * The default value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected static final Float SEVE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected Float seve2 = SEVE2_EDEFAULT;

    /**
     * This is true if the Seve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve2ESet;

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
     * The default value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected static final Float VAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected Float vamax = VAMAX_EDEFAULT;

    /**
     * This is true if the Vamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vamaxESet;

    /**
     * The default value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected static final Float VAMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected Float vamin = VAMIN_EDEFAULT;

    /**
     * This is true if the Vamin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vaminESet;

    /**
     * The default value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected static final Float VE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected Float ve1 = VE1_EDEFAULT;

    /**
     * This is true if the Ve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve1ESet;

    /**
     * The default value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected static final Float VE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected Float ve2 = VE2_EDEFAULT;

    /**
     * This is true if the Ve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve2ESet;

    /**
     * The default value of the '{@link #getVemin() <em>Vemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVemin()
     * @generated
     * @ordered
     */
    protected static final Float VEMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVemin() <em>Vemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVemin()
     * @generated
     * @ordered
     */
    protected Float vemin = VEMIN_EDEFAULT;

    /**
     * This is true if the Vemin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean veminESet;

    /**
     * The default value of the '{@link #getVfemax() <em>Vfemax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfemax()
     * @generated
     * @ordered
     */
    protected static final Float VFEMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfemax() <em>Vfemax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfemax()
     * @generated
     * @ordered
     */
    protected Float vfemax = VFEMAX_EDEFAULT;

    /**
     * This is true if the Vfemax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfemaxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEAC3AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEAC3A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdn() {
        return efdn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdn( Float newEfdn ) {
        Float oldEfdn = efdn;
        efdn = newEfdn;
        boolean oldEfdnESet = efdnESet;
        efdnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__EFDN, oldEfdn, efdn, !oldEfdnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdn() {
        Float oldEfdn = efdn;
        boolean oldEfdnESet = efdnESet;
        efdn = EFDN_EDEFAULT;
        efdnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__EFDN, oldEfdn, EFDN_EDEFAULT, oldEfdnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdn() {
        return efdnESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KA, oldKa, ka, !oldKaESet ) );
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
                CimPackage.EXC_IEEEAC3A__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KC, oldKc, kc, !oldKcESet ) );
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
                CimPackage.EXC_IEEEAC3A__KC, oldKc, KC_EDEFAULT, oldKcESet ) );
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
    public Float getKd() {
        return kd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd( Float newKd ) {
        Float oldKd = kd;
        kd = newKd;
        boolean oldKdESet = kdESet;
        kdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KD, oldKd, kd, !oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd() {
        Float oldKd = kd;
        boolean oldKdESet = kdESet;
        kd = KD_EDEFAULT;
        kdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__KD, oldKd, KD_EDEFAULT, oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd() {
        return kdESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KE, oldKe, ke, !oldKeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__KE, oldKe, KE_EDEFAULT, oldKeESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KF, oldKf, kf, !oldKfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__KF, oldKf, KF_EDEFAULT, oldKfESet ) );
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
    public Float getKn() {
        return kn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKn( Float newKn ) {
        Float oldKn = kn;
        kn = newKn;
        boolean oldKnESet = knESet;
        knESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KN, oldKn, kn, !oldKnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKn() {
        Float oldKn = kn;
        boolean oldKnESet = knESet;
        kn = KN_EDEFAULT;
        knESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__KN, oldKn, KN_EDEFAULT, oldKnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKn() {
        return knESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKr() {
        return kr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKr( Float newKr ) {
        Float oldKr = kr;
        kr = newKr;
        boolean oldKrESet = krESet;
        krESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__KR, oldKr, kr, !oldKrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKr() {
        Float oldKr = kr;
        boolean oldKrESet = krESet;
        kr = KR_EDEFAULT;
        krESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__KR, oldKr, KR_EDEFAULT, oldKrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKr() {
        return krESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSeve1() {
        return seve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve1( Float newSeve1 ) {
        Float oldSeve1 = seve1;
        seve1 = newSeve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__SEVE1, oldSeve1, seve1, !oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve1() {
        Float oldSeve1 = seve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1 = SEVE1_EDEFAULT;
        seve1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__SEVE1, oldSeve1, SEVE1_EDEFAULT, oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve1() {
        return seve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSeve2() {
        return seve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve2( Float newSeve2 ) {
        Float oldSeve2 = seve2;
        seve2 = newSeve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__SEVE2, oldSeve2, seve2, !oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve2() {
        Float oldSeve2 = seve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2 = SEVE2_EDEFAULT;
        seve2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__SEVE2, oldSeve2, SEVE2_EDEFAULT, oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve2() {
        return seve2ESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__TA, oldTa, ta, !oldTaESet ) );
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
                CimPackage.EXC_IEEEAC3A__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__TB, oldTb, tb, !oldTbESet ) );
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
                CimPackage.EXC_IEEEAC3A__TB, oldTb, TB_EDEFAULT, oldTbESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__TC, oldTc, tc, !oldTcESet ) );
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
                CimPackage.EXC_IEEEAC3A__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__TE, oldTe, te, !oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__TE, oldTe, TE_EDEFAULT, oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC3A__TF, oldTf, tf, !oldTfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__TF, oldTf, TF_EDEFAULT, oldTfESet ) );
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
    public Float getVamax() {
        return vamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamax( Float newVamax ) {
        Float oldVamax = vamax;
        vamax = newVamax;
        boolean oldVamaxESet = vamaxESet;
        vamaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VAMAX, oldVamax, vamax, !oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamax() {
        Float oldVamax = vamax;
        boolean oldVamaxESet = vamaxESet;
        vamax = VAMAX_EDEFAULT;
        vamaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VAMAX, oldVamax, VAMAX_EDEFAULT, oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamax() {
        return vamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVamin() {
        return vamin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamin( Float newVamin ) {
        Float oldVamin = vamin;
        vamin = newVamin;
        boolean oldVaminESet = vaminESet;
        vaminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VAMIN, oldVamin, vamin, !oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamin() {
        Float oldVamin = vamin;
        boolean oldVaminESet = vaminESet;
        vamin = VAMIN_EDEFAULT;
        vaminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VAMIN, oldVamin, VAMIN_EDEFAULT, oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamin() {
        return vaminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVe1() {
        return ve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe1( Float newVe1 ) {
        Float oldVe1 = ve1;
        ve1 = newVe1;
        boolean oldVe1ESet = ve1ESet;
        ve1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VE1, oldVe1, ve1, !oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe1() {
        Float oldVe1 = ve1;
        boolean oldVe1ESet = ve1ESet;
        ve1 = VE1_EDEFAULT;
        ve1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VE1, oldVe1, VE1_EDEFAULT, oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe1() {
        return ve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVe2() {
        return ve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe2( Float newVe2 ) {
        Float oldVe2 = ve2;
        ve2 = newVe2;
        boolean oldVe2ESet = ve2ESet;
        ve2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VE2, oldVe2, ve2, !oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe2() {
        Float oldVe2 = ve2;
        boolean oldVe2ESet = ve2ESet;
        ve2 = VE2_EDEFAULT;
        ve2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VE2, oldVe2, VE2_EDEFAULT, oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe2() {
        return ve2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVemin() {
        return vemin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVemin( Float newVemin ) {
        Float oldVemin = vemin;
        vemin = newVemin;
        boolean oldVeminESet = veminESet;
        veminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VEMIN, oldVemin, vemin, !oldVeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVemin() {
        Float oldVemin = vemin;
        boolean oldVeminESet = veminESet;
        vemin = VEMIN_EDEFAULT;
        veminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VEMIN, oldVemin, VEMIN_EDEFAULT, oldVeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVemin() {
        return veminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVfemax() {
        return vfemax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfemax( Float newVfemax ) {
        Float oldVfemax = vfemax;
        vfemax = newVfemax;
        boolean oldVfemaxESet = vfemaxESet;
        vfemaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEAC3A__VFEMAX, oldVfemax, vfemax, !oldVfemaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfemax() {
        Float oldVfemax = vfemax;
        boolean oldVfemaxESet = vfemaxESet;
        vfemax = VFEMAX_EDEFAULT;
        vfemaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEAC3A__VFEMAX, oldVfemax, VFEMAX_EDEFAULT, oldVfemaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfemax() {
        return vfemaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEAC3A__EFDN:
            return getEfdn();
        case CimPackage.EXC_IEEEAC3A__KA:
            return getKa();
        case CimPackage.EXC_IEEEAC3A__KC:
            return getKc();
        case CimPackage.EXC_IEEEAC3A__KD:
            return getKd();
        case CimPackage.EXC_IEEEAC3A__KE:
            return getKe();
        case CimPackage.EXC_IEEEAC3A__KF:
            return getKf();
        case CimPackage.EXC_IEEEAC3A__KN:
            return getKn();
        case CimPackage.EXC_IEEEAC3A__KR:
            return getKr();
        case CimPackage.EXC_IEEEAC3A__SEVE1:
            return getSeve1();
        case CimPackage.EXC_IEEEAC3A__SEVE2:
            return getSeve2();
        case CimPackage.EXC_IEEEAC3A__TA:
            return getTa();
        case CimPackage.EXC_IEEEAC3A__TB:
            return getTb();
        case CimPackage.EXC_IEEEAC3A__TC:
            return getTc();
        case CimPackage.EXC_IEEEAC3A__TE:
            return getTe();
        case CimPackage.EXC_IEEEAC3A__TF:
            return getTf();
        case CimPackage.EXC_IEEEAC3A__VAMAX:
            return getVamax();
        case CimPackage.EXC_IEEEAC3A__VAMIN:
            return getVamin();
        case CimPackage.EXC_IEEEAC3A__VE1:
            return getVe1();
        case CimPackage.EXC_IEEEAC3A__VE2:
            return getVe2();
        case CimPackage.EXC_IEEEAC3A__VEMIN:
            return getVemin();
        case CimPackage.EXC_IEEEAC3A__VFEMAX:
            return getVfemax();
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
        case CimPackage.EXC_IEEEAC3A__EFDN:
            setEfdn( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KN:
            setKn( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__KR:
            setKr( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__SEVE1:
            setSeve1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__SEVE2:
            setSeve2( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VAMAX:
            setVamax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VAMIN:
            setVamin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VE1:
            setVe1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VE2:
            setVe2( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VEMIN:
            setVemin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEAC3A__VFEMAX:
            setVfemax( ( Float ) newValue );
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
        case CimPackage.EXC_IEEEAC3A__EFDN:
            unsetEfdn();
            return;
        case CimPackage.EXC_IEEEAC3A__KA:
            unsetKa();
            return;
        case CimPackage.EXC_IEEEAC3A__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEAC3A__KD:
            unsetKd();
            return;
        case CimPackage.EXC_IEEEAC3A__KE:
            unsetKe();
            return;
        case CimPackage.EXC_IEEEAC3A__KF:
            unsetKf();
            return;
        case CimPackage.EXC_IEEEAC3A__KN:
            unsetKn();
            return;
        case CimPackage.EXC_IEEEAC3A__KR:
            unsetKr();
            return;
        case CimPackage.EXC_IEEEAC3A__SEVE1:
            unsetSeve1();
            return;
        case CimPackage.EXC_IEEEAC3A__SEVE2:
            unsetSeve2();
            return;
        case CimPackage.EXC_IEEEAC3A__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEAC3A__TB:
            unsetTb();
            return;
        case CimPackage.EXC_IEEEAC3A__TC:
            unsetTc();
            return;
        case CimPackage.EXC_IEEEAC3A__TE:
            unsetTe();
            return;
        case CimPackage.EXC_IEEEAC3A__TF:
            unsetTf();
            return;
        case CimPackage.EXC_IEEEAC3A__VAMAX:
            unsetVamax();
            return;
        case CimPackage.EXC_IEEEAC3A__VAMIN:
            unsetVamin();
            return;
        case CimPackage.EXC_IEEEAC3A__VE1:
            unsetVe1();
            return;
        case CimPackage.EXC_IEEEAC3A__VE2:
            unsetVe2();
            return;
        case CimPackage.EXC_IEEEAC3A__VEMIN:
            unsetVemin();
            return;
        case CimPackage.EXC_IEEEAC3A__VFEMAX:
            unsetVfemax();
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
        case CimPackage.EXC_IEEEAC3A__EFDN:
            return isSetEfdn();
        case CimPackage.EXC_IEEEAC3A__KA:
            return isSetKa();
        case CimPackage.EXC_IEEEAC3A__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEAC3A__KD:
            return isSetKd();
        case CimPackage.EXC_IEEEAC3A__KE:
            return isSetKe();
        case CimPackage.EXC_IEEEAC3A__KF:
            return isSetKf();
        case CimPackage.EXC_IEEEAC3A__KN:
            return isSetKn();
        case CimPackage.EXC_IEEEAC3A__KR:
            return isSetKr();
        case CimPackage.EXC_IEEEAC3A__SEVE1:
            return isSetSeve1();
        case CimPackage.EXC_IEEEAC3A__SEVE2:
            return isSetSeve2();
        case CimPackage.EXC_IEEEAC3A__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEAC3A__TB:
            return isSetTb();
        case CimPackage.EXC_IEEEAC3A__TC:
            return isSetTc();
        case CimPackage.EXC_IEEEAC3A__TE:
            return isSetTe();
        case CimPackage.EXC_IEEEAC3A__TF:
            return isSetTf();
        case CimPackage.EXC_IEEEAC3A__VAMAX:
            return isSetVamax();
        case CimPackage.EXC_IEEEAC3A__VAMIN:
            return isSetVamin();
        case CimPackage.EXC_IEEEAC3A__VE1:
            return isSetVe1();
        case CimPackage.EXC_IEEEAC3A__VE2:
            return isSetVe2();
        case CimPackage.EXC_IEEEAC3A__VEMIN:
            return isSetVemin();
        case CimPackage.EXC_IEEEAC3A__VFEMAX:
            return isSetVfemax();
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
        result.append( " (efdn: " );
        if( efdnESet )
            result.append( efdn );
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
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
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
        result.append( ", kn: " );
        if( knESet )
            result.append( kn );
        else
            result.append( "<unset>" );
        result.append( ", kr: " );
        if( krESet )
            result.append( kr );
        else
            result.append( "<unset>" );
        result.append( ", seve1: " );
        if( seve1ESet )
            result.append( seve1 );
        else
            result.append( "<unset>" );
        result.append( ", seve2: " );
        if( seve2ESet )
            result.append( seve2 );
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
        result.append( ", vamax: " );
        if( vamaxESet )
            result.append( vamax );
        else
            result.append( "<unset>" );
        result.append( ", vamin: " );
        if( vaminESet )
            result.append( vamin );
        else
            result.append( "<unset>" );
        result.append( ", ve1: " );
        if( ve1ESet )
            result.append( ve1 );
        else
            result.append( "<unset>" );
        result.append( ", ve2: " );
        if( ve2ESet )
            result.append( ve2 );
        else
            result.append( "<unset>" );
        result.append( ", vemin: " );
        if( veminESet )
            result.append( vemin );
        else
            result.append( "<unset>" );
        result.append( ", vfemax: " );
        if( vfemaxESet )
            result.append( vfemax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEAC3AImpl
