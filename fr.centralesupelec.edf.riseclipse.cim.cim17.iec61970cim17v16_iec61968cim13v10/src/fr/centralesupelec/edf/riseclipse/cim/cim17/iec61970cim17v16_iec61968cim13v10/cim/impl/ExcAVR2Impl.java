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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc AVR2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getE1 <em>E1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getE2 <em>E2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getSe1 <em>Se1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getSe2 <em>Se2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcAVR2Impl#getVrmx <em>Vrmx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcAVR2Impl extends ExcitationSystemDynamicsImpl implements ExcAVR2 {
    /**
     * The default value of the '{@link #getE1() <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE1()
     * @generated
     * @ordered
     */
    protected static final Float E1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE1() <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE1()
     * @generated
     * @ordered
     */
    protected Float e1 = E1_EDEFAULT;

    /**
     * This is true if the E1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean e1ESet;

    /**
     * The default value of the '{@link #getE2() <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE2()
     * @generated
     * @ordered
     */
    protected static final Float E2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE2() <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE2()
     * @generated
     * @ordered
     */
    protected Float e2 = E2_EDEFAULT;

    /**
     * This is true if the E2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean e2ESet;

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
     * The default value of the '{@link #getSe1() <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe1()
     * @generated
     * @ordered
     */
    protected static final Float SE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSe1() <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe1()
     * @generated
     * @ordered
     */
    protected Float se1 = SE1_EDEFAULT;

    /**
     * This is true if the Se1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean se1ESet;

    /**
     * The default value of the '{@link #getSe2() <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe2()
     * @generated
     * @ordered
     */
    protected static final Float SE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSe2() <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe2()
     * @generated
     * @ordered
     */
    protected Float se2 = SE2_EDEFAULT;

    /**
     * This is true if the Se2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean se2ESet;

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
     * The default value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected static final Float TF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected Float tf1 = TF1_EDEFAULT;

    /**
     * This is true if the Tf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf1ESet;

    /**
     * The default value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected static final Float TF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected Float tf2 = TF2_EDEFAULT;

    /**
     * This is true if the Tf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf2ESet;

    /**
     * The default value of the '{@link #getVrmn() <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmn()
     * @generated
     * @ordered
     */
    protected static final Float VRMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmn() <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmn()
     * @generated
     * @ordered
     */
    protected Float vrmn = VRMN_EDEFAULT;

    /**
     * This is true if the Vrmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmnESet;

    /**
     * The default value of the '{@link #getVrmx() <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmx()
     * @generated
     * @ordered
     */
    protected static final Float VRMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmx() <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmx()
     * @generated
     * @ordered
     */
    protected Float vrmx = VRMX_EDEFAULT;

    /**
     * This is true if the Vrmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcAVR2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcAVR2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getE1() {
        return e1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE1( Float newE1 ) {
        Float oldE1 = e1;
        e1 = newE1;
        boolean oldE1ESet = e1ESet;
        e1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__E1, oldE1, e1, !oldE1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE1() {
        Float oldE1 = e1;
        boolean oldE1ESet = e1ESet;
        e1 = E1_EDEFAULT;
        e1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__E1,
                oldE1, E1_EDEFAULT, oldE1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE1() {
        return e1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getE2() {
        return e2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE2( Float newE2 ) {
        Float oldE2 = e2;
        e2 = newE2;
        boolean oldE2ESet = e2ESet;
        e2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__E2, oldE2, e2, !oldE2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE2() {
        Float oldE2 = e2;
        boolean oldE2ESet = e2ESet;
        e2 = E2_EDEFAULT;
        e2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__E2,
                oldE2, E2_EDEFAULT, oldE2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE2() {
        return e2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__KA, oldKa, ka, !oldKaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__KA,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__KF, oldKf, kf, !oldKfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__KF,
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
    public Float getSe1() {
        return se1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSe1( Float newSe1 ) {
        Float oldSe1 = se1;
        se1 = newSe1;
        boolean oldSe1ESet = se1ESet;
        se1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__SE1, oldSe1, se1, !oldSe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSe1() {
        Float oldSe1 = se1;
        boolean oldSe1ESet = se1ESet;
        se1 = SE1_EDEFAULT;
        se1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__SE1, oldSe1, SE1_EDEFAULT, oldSe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSe1() {
        return se1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSe2() {
        return se2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSe2( Float newSe2 ) {
        Float oldSe2 = se2;
        se2 = newSe2;
        boolean oldSe2ESet = se2ESet;
        se2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__SE2, oldSe2, se2, !oldSe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSe2() {
        Float oldSe2 = se2;
        boolean oldSe2ESet = se2ESet;
        se2 = SE2_EDEFAULT;
        se2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__SE2, oldSe2, SE2_EDEFAULT, oldSe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSe2() {
        return se2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__TA, oldTa, ta, !oldTaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__TA,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__TB, oldTb, tb, !oldTbESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__TB,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__TE, oldTe, te, !oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR2__TE,
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
    public Float getTf1() {
        return tf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf1( Float newTf1 ) {
        Float oldTf1 = tf1;
        tf1 = newTf1;
        boolean oldTf1ESet = tf1ESet;
        tf1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__TF1, oldTf1, tf1, !oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf1() {
        Float oldTf1 = tf1;
        boolean oldTf1ESet = tf1ESet;
        tf1 = TF1_EDEFAULT;
        tf1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__TF1, oldTf1, TF1_EDEFAULT, oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf1() {
        return tf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf2() {
        return tf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf2( Float newTf2 ) {
        Float oldTf2 = tf2;
        tf2 = newTf2;
        boolean oldTf2ESet = tf2ESet;
        tf2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__TF2, oldTf2, tf2, !oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf2() {
        Float oldTf2 = tf2;
        boolean oldTf2ESet = tf2ESet;
        tf2 = TF2_EDEFAULT;
        tf2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__TF2, oldTf2, TF2_EDEFAULT, oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf2() {
        return tf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmn() {
        return vrmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmn( Float newVrmn ) {
        Float oldVrmn = vrmn;
        vrmn = newVrmn;
        boolean oldVrmnESet = vrmnESet;
        vrmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__VRMN,
                oldVrmn, vrmn, !oldVrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmn() {
        Float oldVrmn = vrmn;
        boolean oldVrmnESet = vrmnESet;
        vrmn = VRMN_EDEFAULT;
        vrmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__VRMN, oldVrmn, VRMN_EDEFAULT, oldVrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmn() {
        return vrmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmx() {
        return vrmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmx( Float newVrmx ) {
        Float oldVrmx = vrmx;
        vrmx = newVrmx;
        boolean oldVrmxESet = vrmxESet;
        vrmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR2__VRMX,
                oldVrmx, vrmx, !oldVrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmx() {
        Float oldVrmx = vrmx;
        boolean oldVrmxESet = vrmxESet;
        vrmx = VRMX_EDEFAULT;
        vrmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_AVR2__VRMX, oldVrmx, VRMX_EDEFAULT, oldVrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmx() {
        return vrmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_AVR2__E1:
            return getE1();
        case CimPackage.EXC_AVR2__E2:
            return getE2();
        case CimPackage.EXC_AVR2__KA:
            return getKa();
        case CimPackage.EXC_AVR2__KF:
            return getKf();
        case CimPackage.EXC_AVR2__SE1:
            return getSe1();
        case CimPackage.EXC_AVR2__SE2:
            return getSe2();
        case CimPackage.EXC_AVR2__TA:
            return getTa();
        case CimPackage.EXC_AVR2__TB:
            return getTb();
        case CimPackage.EXC_AVR2__TE:
            return getTe();
        case CimPackage.EXC_AVR2__TF1:
            return getTf1();
        case CimPackage.EXC_AVR2__TF2:
            return getTf2();
        case CimPackage.EXC_AVR2__VRMN:
            return getVrmn();
        case CimPackage.EXC_AVR2__VRMX:
            return getVrmx();
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
        case CimPackage.EXC_AVR2__E1:
            setE1( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__E2:
            setE2( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__SE1:
            setSe1( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__SE2:
            setSe2( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__TF1:
            setTf1( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__TF2:
            setTf2( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__VRMN:
            setVrmn( ( Float ) newValue );
            return;
        case CimPackage.EXC_AVR2__VRMX:
            setVrmx( ( Float ) newValue );
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
        case CimPackage.EXC_AVR2__E1:
            unsetE1();
            return;
        case CimPackage.EXC_AVR2__E2:
            unsetE2();
            return;
        case CimPackage.EXC_AVR2__KA:
            unsetKa();
            return;
        case CimPackage.EXC_AVR2__KF:
            unsetKf();
            return;
        case CimPackage.EXC_AVR2__SE1:
            unsetSe1();
            return;
        case CimPackage.EXC_AVR2__SE2:
            unsetSe2();
            return;
        case CimPackage.EXC_AVR2__TA:
            unsetTa();
            return;
        case CimPackage.EXC_AVR2__TB:
            unsetTb();
            return;
        case CimPackage.EXC_AVR2__TE:
            unsetTe();
            return;
        case CimPackage.EXC_AVR2__TF1:
            unsetTf1();
            return;
        case CimPackage.EXC_AVR2__TF2:
            unsetTf2();
            return;
        case CimPackage.EXC_AVR2__VRMN:
            unsetVrmn();
            return;
        case CimPackage.EXC_AVR2__VRMX:
            unsetVrmx();
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
        case CimPackage.EXC_AVR2__E1:
            return isSetE1();
        case CimPackage.EXC_AVR2__E2:
            return isSetE2();
        case CimPackage.EXC_AVR2__KA:
            return isSetKa();
        case CimPackage.EXC_AVR2__KF:
            return isSetKf();
        case CimPackage.EXC_AVR2__SE1:
            return isSetSe1();
        case CimPackage.EXC_AVR2__SE2:
            return isSetSe2();
        case CimPackage.EXC_AVR2__TA:
            return isSetTa();
        case CimPackage.EXC_AVR2__TB:
            return isSetTb();
        case CimPackage.EXC_AVR2__TE:
            return isSetTe();
        case CimPackage.EXC_AVR2__TF1:
            return isSetTf1();
        case CimPackage.EXC_AVR2__TF2:
            return isSetTf2();
        case CimPackage.EXC_AVR2__VRMN:
            return isSetVrmn();
        case CimPackage.EXC_AVR2__VRMX:
            return isSetVrmx();
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
        result.append( " (e1: " );
        if( e1ESet )
            result.append( e1 );
        else
            result.append( "<unset>" );
        result.append( ", e2: " );
        if( e2ESet )
            result.append( e2 );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", se1: " );
        if( se1ESet )
            result.append( se1 );
        else
            result.append( "<unset>" );
        result.append( ", se2: " );
        if( se2ESet )
            result.append( se2 );
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
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tf1: " );
        if( tf1ESet )
            result.append( tf1 );
        else
            result.append( "<unset>" );
        result.append( ", tf2: " );
        if( tf2ESet )
            result.append( tf2 );
        else
            result.append( "<unset>" );
        result.append( ", vrmn: " );
        if( vrmnESet )
            result.append( vrmn );
        else
            result.append( "<unset>" );
        result.append( ", vrmx: " );
        if( vrmxESet )
            result.append( vrmx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcAVR2Impl
