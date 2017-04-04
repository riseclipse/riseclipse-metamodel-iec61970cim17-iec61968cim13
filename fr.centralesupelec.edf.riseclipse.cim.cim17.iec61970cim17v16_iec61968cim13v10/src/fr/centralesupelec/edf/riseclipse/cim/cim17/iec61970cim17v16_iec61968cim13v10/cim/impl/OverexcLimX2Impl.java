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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimX2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getEfd3 <em>Efd3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getEfddes <em>Efddes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getEfdrated <em>Efdrated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getKmx <em>Kmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcLimX2Impl#getVlow <em>Vlow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcLimX2Impl extends OverexcitationLimiterDynamicsImpl implements OverexcLimX2 {
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
     * The default value of the '{@link #getEfd3() <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd3()
     * @generated
     * @ordered
     */
    protected static final Float EFD3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd3() <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd3()
     * @generated
     * @ordered
     */
    protected Float efd3 = EFD3_EDEFAULT;

    /**
     * This is true if the Efd3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd3ESet;

    /**
     * The default value of the '{@link #getEfddes() <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfddes()
     * @generated
     * @ordered
     */
    protected static final Float EFDDES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfddes() <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfddes()
     * @generated
     * @ordered
     */
    protected Float efddes = EFDDES_EDEFAULT;

    /**
     * This is true if the Efddes attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efddesESet;

    /**
     * The default value of the '{@link #getEfdrated() <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdrated()
     * @generated
     * @ordered
     */
    protected static final Float EFDRATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdrated() <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdrated()
     * @generated
     * @ordered
     */
    protected Float efdrated = EFDRATED_EDEFAULT;

    /**
     * This is true if the Efdrated attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdratedESet;

    /**
     * The default value of the '{@link #getKmx() <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmx()
     * @generated
     * @ordered
     */
    protected static final Float KMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKmx() <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmx()
     * @generated
     * @ordered
     */
    protected Float kmx = KMX_EDEFAULT;

    /**
     * This is true if the Kmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmxESet;

    /**
     * The default value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected static final Boolean M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected Boolean m = M_EDEFAULT;

    /**
     * This is true if the M attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Float T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Float t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Float T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Float t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * The default value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected static final Float T3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected Float t3 = T3_EDEFAULT;

    /**
     * This is true if the T3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3ESet;

    /**
     * The default value of the '{@link #getVlow() <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlow()
     * @generated
     * @ordered
     */
    protected static final Float VLOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlow() <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlow()
     * @generated
     * @ordered
     */
    protected Float vlow = VLOW_EDEFAULT;

    /**
     * This is true if the Vlow attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vlowESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcLimX2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcLimX2();
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
                CimPackage.OVEREXC_LIM_X2__EFD1, oldEfd1, efd1, !oldEfd1ESet ) );
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
                CimPackage.OVEREXC_LIM_X2__EFD1, oldEfd1, EFD1_EDEFAULT, oldEfd1ESet ) );
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
                CimPackage.OVEREXC_LIM_X2__EFD2, oldEfd2, efd2, !oldEfd2ESet ) );
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
                CimPackage.OVEREXC_LIM_X2__EFD2, oldEfd2, EFD2_EDEFAULT, oldEfd2ESet ) );
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
    public Float getEfd3() {
        return efd3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd3( Float newEfd3 ) {
        Float oldEfd3 = efd3;
        efd3 = newEfd3;
        boolean oldEfd3ESet = efd3ESet;
        efd3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_X2__EFD3, oldEfd3, efd3, !oldEfd3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd3() {
        Float oldEfd3 = efd3;
        boolean oldEfd3ESet = efd3ESet;
        efd3 = EFD3_EDEFAULT;
        efd3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__EFD3, oldEfd3, EFD3_EDEFAULT, oldEfd3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd3() {
        return efd3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfddes() {
        return efddes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfddes( Float newEfddes ) {
        Float oldEfddes = efddes;
        efddes = newEfddes;
        boolean oldEfddesESet = efddesESet;
        efddesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_X2__EFDDES, oldEfddes, efddes, !oldEfddesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfddes() {
        Float oldEfddes = efddes;
        boolean oldEfddesESet = efddesESet;
        efddes = EFDDES_EDEFAULT;
        efddesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__EFDDES, oldEfddes, EFDDES_EDEFAULT, oldEfddesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfddes() {
        return efddesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdrated() {
        return efdrated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdrated( Float newEfdrated ) {
        Float oldEfdrated = efdrated;
        efdrated = newEfdrated;
        boolean oldEfdratedESet = efdratedESet;
        efdratedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_X2__EFDRATED, oldEfdrated, efdrated, !oldEfdratedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdrated() {
        Float oldEfdrated = efdrated;
        boolean oldEfdratedESet = efdratedESet;
        efdrated = EFDRATED_EDEFAULT;
        efdratedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__EFDRATED, oldEfdrated, EFDRATED_EDEFAULT, oldEfdratedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdrated() {
        return efdratedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKmx() {
        return kmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKmx( Float newKmx ) {
        Float oldKmx = kmx;
        kmx = newKmx;
        boolean oldKmxESet = kmxESet;
        kmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_X2__KMX, oldKmx, kmx, !oldKmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKmx() {
        Float oldKmx = kmx;
        boolean oldKmxESet = kmxESet;
        kmx = KMX_EDEFAULT;
        kmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__KMX, oldKmx, KMX_EDEFAULT, oldKmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKmx() {
        return kmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getM() {
        return m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setM( Boolean newM ) {
        Boolean oldM = m;
        m = newM;
        boolean oldMESet = mESet;
        mESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__M, oldM, m, !oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetM() {
        Boolean oldM = m;
        boolean oldMESet = mESet;
        m = M_EDEFAULT;
        mESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__M, oldM, M_EDEFAULT, oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetM() {
        return mESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Float newT1 ) {
        Float oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T1, oldT1, t1, !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Float oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Float newT2 ) {
        Float oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T2, oldT2, t2, !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Float oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__T2, oldT2, T2_EDEFAULT, oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT3() {
        return t3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3( Float newT3 ) {
        Float oldT3 = t3;
        t3 = newT3;
        boolean oldT3ESet = t3ESet;
        t3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T3, oldT3, t3, !oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3() {
        Float oldT3 = t3;
        boolean oldT3ESet = t3ESet;
        t3 = T3_EDEFAULT;
        t3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__T3, oldT3, T3_EDEFAULT, oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3() {
        return t3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVlow() {
        return vlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlow( Float newVlow ) {
        Float oldVlow = vlow;
        vlow = newVlow;
        boolean oldVlowESet = vlowESet;
        vlowESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXC_LIM_X2__VLOW, oldVlow, vlow, !oldVlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVlow() {
        Float oldVlow = vlow;
        boolean oldVlowESet = vlowESet;
        vlow = VLOW_EDEFAULT;
        vlowESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXC_LIM_X2__VLOW, oldVlow, VLOW_EDEFAULT, oldVlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVlow() {
        return vlowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            return getEfd1();
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            return getEfd2();
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            return getEfd3();
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            return getEfddes();
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            return getEfdrated();
        case CimPackage.OVEREXC_LIM_X2__KMX:
            return getKmx();
        case CimPackage.OVEREXC_LIM_X2__M:
            return getM();
        case CimPackage.OVEREXC_LIM_X2__T1:
            return getT1();
        case CimPackage.OVEREXC_LIM_X2__T2:
            return getT2();
        case CimPackage.OVEREXC_LIM_X2__T3:
            return getT3();
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            return getVlow();
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
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            setEfd1( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            setEfd2( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            setEfd3( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            setEfddes( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            setEfdrated( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__KMX:
            setKmx( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__M:
            setM( ( Boolean ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T3:
            setT3( ( Float ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            setVlow( ( Float ) newValue );
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
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            unsetEfd1();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            unsetEfd2();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            unsetEfd3();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            unsetEfddes();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            unsetEfdrated();
            return;
        case CimPackage.OVEREXC_LIM_X2__KMX:
            unsetKmx();
            return;
        case CimPackage.OVEREXC_LIM_X2__M:
            unsetM();
            return;
        case CimPackage.OVEREXC_LIM_X2__T1:
            unsetT1();
            return;
        case CimPackage.OVEREXC_LIM_X2__T2:
            unsetT2();
            return;
        case CimPackage.OVEREXC_LIM_X2__T3:
            unsetT3();
            return;
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            unsetVlow();
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
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            return isSetEfd1();
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            return isSetEfd2();
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            return isSetEfd3();
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            return isSetEfddes();
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            return isSetEfdrated();
        case CimPackage.OVEREXC_LIM_X2__KMX:
            return isSetKmx();
        case CimPackage.OVEREXC_LIM_X2__M:
            return isSetM();
        case CimPackage.OVEREXC_LIM_X2__T1:
            return isSetT1();
        case CimPackage.OVEREXC_LIM_X2__T2:
            return isSetT2();
        case CimPackage.OVEREXC_LIM_X2__T3:
            return isSetT3();
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            return isSetVlow();
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
        result.append( ", efd3: " );
        if( efd3ESet )
            result.append( efd3 );
        else
            result.append( "<unset>" );
        result.append( ", efddes: " );
        if( efddesESet )
            result.append( efddes );
        else
            result.append( "<unset>" );
        result.append( ", efdrated: " );
        if( efdratedESet )
            result.append( efdrated );
        else
            result.append( "<unset>" );
        result.append( ", kmx: " );
        if( kmxESet )
            result.append( kmx );
        else
            result.append( "<unset>" );
        result.append( ", m: " );
        if( mESet )
            result.append( m );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", vlow: " );
        if( vlowESet )
            result.append( vlow );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcLimX2Impl
