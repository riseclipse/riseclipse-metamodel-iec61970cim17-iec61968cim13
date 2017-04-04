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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC4B;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEDC4B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getOelin <em>Oelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getSeefd1 <em>Seefd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getSeefd2 <em>Seefd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getUelin <em>Uelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getVemin <em>Vemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEDC4BImpl#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEDC4BImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEDC4B {
    /**
     * The default value of the '{@link #getEfd1() <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd1()
     * @generated
     * @ordered
     */
    protected static final Float EFD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd1() <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd1()
     * @generated
     * @ordered
     */
    protected Float efd1 = EFD1_EDEFAULT;

    /**
     * This is true if the Efd1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd1ESet;

    /**
     * The default value of the '{@link #getEfd2() <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd2()
     * @generated
     * @ordered
     */
    protected static final Float EFD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd2() <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd2()
     * @generated
     * @ordered
     */
    protected Float efd2 = EFD2_EDEFAULT;

    /**
     * This is true if the Efd2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd2ESet;

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
     * The default value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected static final Boolean OELIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected Boolean oelin = OELIN_EDEFAULT;

    /**
     * This is true if the Oelin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oelinESet;

    /**
     * The default value of the '{@link #getSeefd1() <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd1()
     * @generated
     * @ordered
     */
    protected static final Float SEEFD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeefd1() <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd1()
     * @generated
     * @ordered
     */
    protected Float seefd1 = SEEFD1_EDEFAULT;

    /**
     * This is true if the Seefd1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seefd1ESet;

    /**
     * The default value of the '{@link #getSeefd2() <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd2()
     * @generated
     * @ordered
     */
    protected static final Float SEEFD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeefd2() <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd2()
     * @generated
     * @ordered
     */
    protected Float seefd2 = SEEFD2_EDEFAULT;

    /**
     * This is true if the Seefd2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seefd2ESet;

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
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Float TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Float td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

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
    protected ExcIEEEDC4BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEDC4B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfd1() {
        return efd1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd1( Float newEfd1 ) {
        Float oldEfd1 = efd1;
        efd1 = newEfd1;
        boolean oldEfd1ESet = efd1ESet;
        efd1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEDC4B__EFD1, oldEfd1, efd1, !oldEfd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd1() {
        Float oldEfd1 = efd1;
        boolean oldEfd1ESet = efd1ESet;
        efd1 = EFD1_EDEFAULT;
        efd1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__EFD1, oldEfd1, EFD1_EDEFAULT, oldEfd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd1() {
        return efd1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfd2() {
        return efd2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd2( Float newEfd2 ) {
        Float oldEfd2 = efd2;
        efd2 = newEfd2;
        boolean oldEfd2ESet = efd2ESet;
        efd2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEDC4B__EFD2, oldEfd2, efd2, !oldEfd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd2() {
        Float oldEfd2 = efd2;
        boolean oldEfd2ESet = efd2ESet;
        efd2 = EFD2_EDEFAULT;
        efd2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__EFD2, oldEfd2, EFD2_EDEFAULT, oldEfd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd2() {
        return efd2ESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KA, oldKa, ka, !oldKaESet ) );
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
                CimPackage.EXC_IEEEDC4B__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KD, oldKd, kd, !oldKdESet ) );
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
                CimPackage.EXC_IEEEDC4B__KD, oldKd, KD_EDEFAULT, oldKdESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KE, oldKe, ke, !oldKeESet ) );
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
                CimPackage.EXC_IEEEDC4B__KE, oldKe, KE_EDEFAULT, oldKeESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KF, oldKf, kf, !oldKfESet ) );
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
                CimPackage.EXC_IEEEDC4B__KF, oldKf, KF_EDEFAULT, oldKfESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KI, oldKi, ki, !oldKiESet ) );
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
                CimPackage.EXC_IEEEDC4B__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__KP, oldKp, kp, !oldKpESet ) );
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
                CimPackage.EXC_IEEEDC4B__KP, oldKp, KP_EDEFAULT, oldKpESet ) );
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
    public Boolean getOelin() {
        return oelin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOelin( Boolean newOelin ) {
        Boolean oldOelin = oelin;
        oelin = newOelin;
        boolean oldOelinESet = oelinESet;
        oelinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEDC4B__OELIN, oldOelin, oelin, !oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOelin() {
        Boolean oldOelin = oelin;
        boolean oldOelinESet = oelinESet;
        oelin = OELIN_EDEFAULT;
        oelinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__OELIN, oldOelin, OELIN_EDEFAULT, oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOelin() {
        return oelinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSeefd1() {
        return seefd1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeefd1( Float newSeefd1 ) {
        Float oldSeefd1 = seefd1;
        seefd1 = newSeefd1;
        boolean oldSeefd1ESet = seefd1ESet;
        seefd1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEDC4B__SEEFD1, oldSeefd1, seefd1, !oldSeefd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeefd1() {
        Float oldSeefd1 = seefd1;
        boolean oldSeefd1ESet = seefd1ESet;
        seefd1 = SEEFD1_EDEFAULT;
        seefd1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__SEEFD1, oldSeefd1, SEEFD1_EDEFAULT, oldSeefd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeefd1() {
        return seefd1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSeefd2() {
        return seefd2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeefd2( Float newSeefd2 ) {
        Float oldSeefd2 = seefd2;
        seefd2 = newSeefd2;
        boolean oldSeefd2ESet = seefd2ESet;
        seefd2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEDC4B__SEEFD2, oldSeefd2, seefd2, !oldSeefd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeefd2() {
        Float oldSeefd2 = seefd2;
        boolean oldSeefd2ESet = seefd2ESet;
        seefd2 = SEEFD2_EDEFAULT;
        seefd2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__SEEFD2, oldSeefd2, SEEFD2_EDEFAULT, oldSeefd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeefd2() {
        return seefd2ESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__TA, oldTa, ta, !oldTaESet ) );
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
                CimPackage.EXC_IEEEDC4B__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
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
    public Float getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Float newTd ) {
        Float oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__TD, oldTd, td, !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Float oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEDC4B__TD, oldTd, TD_EDEFAULT, oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__TE, oldTe, te, !oldTeESet ) );
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
                CimPackage.EXC_IEEEDC4B__TE, oldTe, TE_EDEFAULT, oldTeESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC4B__TF, oldTf, tf, !oldTfESet ) );
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
                CimPackage.EXC_IEEEDC4B__TF, oldTf, TF_EDEFAULT, oldTfESet ) );
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
                CimPackage.EXC_IEEEDC4B__UELIN, oldUelin, uelin, !oldUelinESet ) );
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
                CimPackage.EXC_IEEEDC4B__UELIN, oldUelin, UELIN_EDEFAULT, oldUelinESet ) );
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
                CimPackage.EXC_IEEEDC4B__VEMIN, oldVemin, vemin, !oldVeminESet ) );
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
                CimPackage.EXC_IEEEDC4B__VEMIN, oldVemin, VEMIN_EDEFAULT, oldVeminESet ) );
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
                CimPackage.EXC_IEEEDC4B__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_IEEEDC4B__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
                CimPackage.EXC_IEEEDC4B__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_IEEEDC4B__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
        case CimPackage.EXC_IEEEDC4B__EFD1:
            return getEfd1();
        case CimPackage.EXC_IEEEDC4B__EFD2:
            return getEfd2();
        case CimPackage.EXC_IEEEDC4B__KA:
            return getKa();
        case CimPackage.EXC_IEEEDC4B__KD:
            return getKd();
        case CimPackage.EXC_IEEEDC4B__KE:
            return getKe();
        case CimPackage.EXC_IEEEDC4B__KF:
            return getKf();
        case CimPackage.EXC_IEEEDC4B__KI:
            return getKi();
        case CimPackage.EXC_IEEEDC4B__KP:
            return getKp();
        case CimPackage.EXC_IEEEDC4B__OELIN:
            return getOelin();
        case CimPackage.EXC_IEEEDC4B__SEEFD1:
            return getSeefd1();
        case CimPackage.EXC_IEEEDC4B__SEEFD2:
            return getSeefd2();
        case CimPackage.EXC_IEEEDC4B__TA:
            return getTa();
        case CimPackage.EXC_IEEEDC4B__TD:
            return getTd();
        case CimPackage.EXC_IEEEDC4B__TE:
            return getTe();
        case CimPackage.EXC_IEEEDC4B__TF:
            return getTf();
        case CimPackage.EXC_IEEEDC4B__UELIN:
            return getUelin();
        case CimPackage.EXC_IEEEDC4B__VEMIN:
            return getVemin();
        case CimPackage.EXC_IEEEDC4B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEDC4B__VRMIN:
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
        case CimPackage.EXC_IEEEDC4B__EFD1:
            setEfd1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__EFD2:
            setEfd2( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__OELIN:
            setOelin( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__SEEFD1:
            setSeefd1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__SEEFD2:
            setSeefd2( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__TD:
            setTd( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__UELIN:
            setUelin( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__VEMIN:
            setVemin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEDC4B__VRMIN:
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
        case CimPackage.EXC_IEEEDC4B__EFD1:
            unsetEfd1();
            return;
        case CimPackage.EXC_IEEEDC4B__EFD2:
            unsetEfd2();
            return;
        case CimPackage.EXC_IEEEDC4B__KA:
            unsetKa();
            return;
        case CimPackage.EXC_IEEEDC4B__KD:
            unsetKd();
            return;
        case CimPackage.EXC_IEEEDC4B__KE:
            unsetKe();
            return;
        case CimPackage.EXC_IEEEDC4B__KF:
            unsetKf();
            return;
        case CimPackage.EXC_IEEEDC4B__KI:
            unsetKi();
            return;
        case CimPackage.EXC_IEEEDC4B__KP:
            unsetKp();
            return;
        case CimPackage.EXC_IEEEDC4B__OELIN:
            unsetOelin();
            return;
        case CimPackage.EXC_IEEEDC4B__SEEFD1:
            unsetSeefd1();
            return;
        case CimPackage.EXC_IEEEDC4B__SEEFD2:
            unsetSeefd2();
            return;
        case CimPackage.EXC_IEEEDC4B__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEDC4B__TD:
            unsetTd();
            return;
        case CimPackage.EXC_IEEEDC4B__TE:
            unsetTe();
            return;
        case CimPackage.EXC_IEEEDC4B__TF:
            unsetTf();
            return;
        case CimPackage.EXC_IEEEDC4B__UELIN:
            unsetUelin();
            return;
        case CimPackage.EXC_IEEEDC4B__VEMIN:
            unsetVemin();
            return;
        case CimPackage.EXC_IEEEDC4B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEDC4B__VRMIN:
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
        case CimPackage.EXC_IEEEDC4B__EFD1:
            return isSetEfd1();
        case CimPackage.EXC_IEEEDC4B__EFD2:
            return isSetEfd2();
        case CimPackage.EXC_IEEEDC4B__KA:
            return isSetKa();
        case CimPackage.EXC_IEEEDC4B__KD:
            return isSetKd();
        case CimPackage.EXC_IEEEDC4B__KE:
            return isSetKe();
        case CimPackage.EXC_IEEEDC4B__KF:
            return isSetKf();
        case CimPackage.EXC_IEEEDC4B__KI:
            return isSetKi();
        case CimPackage.EXC_IEEEDC4B__KP:
            return isSetKp();
        case CimPackage.EXC_IEEEDC4B__OELIN:
            return isSetOelin();
        case CimPackage.EXC_IEEEDC4B__SEEFD1:
            return isSetSeefd1();
        case CimPackage.EXC_IEEEDC4B__SEEFD2:
            return isSetSeefd2();
        case CimPackage.EXC_IEEEDC4B__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEDC4B__TD:
            return isSetTd();
        case CimPackage.EXC_IEEEDC4B__TE:
            return isSetTe();
        case CimPackage.EXC_IEEEDC4B__TF:
            return isSetTf();
        case CimPackage.EXC_IEEEDC4B__UELIN:
            return isSetUelin();
        case CimPackage.EXC_IEEEDC4B__VEMIN:
            return isSetVemin();
        case CimPackage.EXC_IEEEDC4B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEDC4B__VRMIN:
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
        result.append( " (efd1: " );
        if( efd1ESet )
            result.append( efd1 );
        else
            result.append( "<unset>" );
        result.append( ", efd2: " );
        if( efd2ESet )
            result.append( efd2 );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
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
        result.append( ", oelin: " );
        if( oelinESet )
            result.append( oelin );
        else
            result.append( "<unset>" );
        result.append( ", seefd1: " );
        if( seefd1ESet )
            result.append( seefd1 );
        else
            result.append( "<unset>" );
        result.append( ", seefd2: " );
        if( seefd2ESet )
            result.append( seefd2 );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
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
        result.append( ", vemin: " );
        if( veminESet )
            result.append( vemin );
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

} //ExcIEEEDC4BImpl
