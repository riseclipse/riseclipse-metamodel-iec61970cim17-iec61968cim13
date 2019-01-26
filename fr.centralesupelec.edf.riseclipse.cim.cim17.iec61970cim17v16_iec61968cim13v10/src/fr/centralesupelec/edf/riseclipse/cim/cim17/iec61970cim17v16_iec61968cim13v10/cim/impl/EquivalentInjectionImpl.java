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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getRegulationCapability <em>Regulation Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getRegulationTarget <em>Regulation Target</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentInjectionImpl#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentInjectionImpl extends EquivalentEquipmentImpl implements EquivalentInjection {
    /**
     * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected Float maxP = MAX_P_EDEFAULT;

    /**
     * This is true if the Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxPESet;

    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Float MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Float maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected Float minP = MIN_P_EDEFAULT;

    /**
     * This is true if the Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minPESet;

    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Float MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Float minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The default value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected static final Float P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected Float p = P_EDEFAULT;

    /**
     * This is true if the P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Float Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Float q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected static final Float R2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected Float r2 = R2_EDEFAULT;

    /**
     * This is true if the R2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r2ESet;

    /**
     * The default value of the '{@link #getRegulationCapability() <em>Regulation Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationCapability()
     * @generated
     * @ordered
     */
    protected static final Boolean REGULATION_CAPABILITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegulationCapability() <em>Regulation Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationCapability()
     * @generated
     * @ordered
     */
    protected Boolean regulationCapability = REGULATION_CAPABILITY_EDEFAULT;

    /**
     * This is true if the Regulation Capability attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulationCapabilityESet;

    /**
     * The default value of the '{@link #getRegulationStatus() <em>Regulation Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationStatus()
     * @generated
     * @ordered
     */
    protected static final Boolean REGULATION_STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegulationStatus() <em>Regulation Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationStatus()
     * @generated
     * @ordered
     */
    protected Boolean regulationStatus = REGULATION_STATUS_EDEFAULT;

    /**
     * This is true if the Regulation Status attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulationStatusESet;

    /**
     * The default value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationTarget()
     * @generated
     * @ordered
     */
    protected static final Float REGULATION_TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationTarget()
     * @generated
     * @ordered
     */
    protected Float regulationTarget = REGULATION_TARGET_EDEFAULT;

    /**
     * This is true if the Regulation Target attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulationTargetESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected static final Float X2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected Float x2 = X2_EDEFAULT;

    /**
     * This is true if the X2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x2ESet;

    /**
     * The cached value of the '{@link #getReactiveCapabilityCurve() <em>Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactiveCapabilityCurve()
     * @generated
     * @ordered
     */
    protected ReactiveCapabilityCurve reactiveCapabilityCurve;

    /**
     * This is true if the Reactive Capability Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reactiveCapabilityCurveESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquivalentInjectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquivalentInjection();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxP() {
        return maxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxP( Float newMaxP ) {
        Float oldMaxP = maxP;
        maxP = newMaxP;
        boolean oldMaxPESet = maxPESet;
        maxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__MAX_P, oldMaxP, maxP, !oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxP() {
        Float oldMaxP = maxP;
        boolean oldMaxPESet = maxPESet;
        maxP = MAX_P_EDEFAULT;
        maxPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__MAX_P, oldMaxP, MAX_P_EDEFAULT, oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxP() {
        return maxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Float newMaxQ ) {
        Float oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__MAX_Q, oldMaxQ, maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Float oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__MAX_Q, oldMaxQ, MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinP() {
        return minP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinP( Float newMinP ) {
        Float oldMinP = minP;
        minP = newMinP;
        boolean oldMinPESet = minPESet;
        minPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__MIN_P, oldMinP, minP, !oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinP() {
        Float oldMinP = minP;
        boolean oldMinPESet = minPESet;
        minP = MIN_P_EDEFAULT;
        minPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__MIN_P, oldMinP, MIN_P_EDEFAULT, oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinP() {
        return minPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Float newMinQ ) {
        Float oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__MIN_Q, oldMinQ, minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Float oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__MIN_Q, oldMinQ, MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP() {
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP( Float newP ) {
        Float oldP = p;
        p = newP;
        boolean oldPESet = pESet;
        pESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__P, oldP, p, !oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        Float oldP = p;
        boolean oldPESet = pESet;
        p = P_EDEFAULT;
        pESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__P, oldP, P_EDEFAULT, oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return pESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Float newQ ) {
        Float oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__Q, oldQ, q, !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Float oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__Q, oldQ, Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR2() {
        return r2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR2( Float newR2 ) {
        Float oldR2 = r2;
        r2 = newR2;
        boolean oldR2ESet = r2ESet;
        r2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__R2, oldR2, r2, !oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR2() {
        Float oldR2 = r2;
        boolean oldR2ESet = r2ESet;
        r2 = R2_EDEFAULT;
        r2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__R2, oldR2, R2_EDEFAULT, oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR2() {
        return r2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRegulationCapability() {
        return regulationCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRegulationCapability( Boolean newRegulationCapability ) {
        Boolean oldRegulationCapability = regulationCapability;
        regulationCapability = newRegulationCapability;
        boolean oldRegulationCapabilityESet = regulationCapabilityESet;
        regulationCapabilityESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY,
                        oldRegulationCapability, regulationCapability, !oldRegulationCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulationCapability() {
        Boolean oldRegulationCapability = regulationCapability;
        boolean oldRegulationCapabilityESet = regulationCapabilityESet;
        regulationCapability = REGULATION_CAPABILITY_EDEFAULT;
        regulationCapabilityESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY,
                        oldRegulationCapability, REGULATION_CAPABILITY_EDEFAULT, oldRegulationCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulationCapability() {
        return regulationCapabilityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRegulationStatus() {
        return regulationStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRegulationStatus( Boolean newRegulationStatus ) {
        Boolean oldRegulationStatus = regulationStatus;
        regulationStatus = newRegulationStatus;
        boolean oldRegulationStatusESet = regulationStatusESet;
        regulationStatusESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS,
                    oldRegulationStatus, regulationStatus, !oldRegulationStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulationStatus() {
        Boolean oldRegulationStatus = regulationStatus;
        boolean oldRegulationStatusESet = regulationStatusESet;
        regulationStatus = REGULATION_STATUS_EDEFAULT;
        regulationStatusESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS,
                        oldRegulationStatus, REGULATION_STATUS_EDEFAULT, oldRegulationStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulationStatus() {
        return regulationStatusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRegulationTarget() {
        return regulationTarget;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRegulationTarget( Float newRegulationTarget ) {
        Float oldRegulationTarget = regulationTarget;
        regulationTarget = newRegulationTarget;
        boolean oldRegulationTargetESet = regulationTargetESet;
        regulationTargetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET,
                    oldRegulationTarget, regulationTarget, !oldRegulationTargetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulationTarget() {
        Float oldRegulationTarget = regulationTarget;
        boolean oldRegulationTargetESet = regulationTargetESet;
        regulationTarget = REGULATION_TARGET_EDEFAULT;
        regulationTargetESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET,
                        oldRegulationTarget, REGULATION_TARGET_EDEFAULT, oldRegulationTargetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulationTarget() {
        return regulationTargetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX2() {
        return x2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX2( Float newX2 ) {
        Float oldX2 = x2;
        x2 = newX2;
        boolean oldX2ESet = x2ESet;
        x2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIVALENT_INJECTION__X2, oldX2, x2, !oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX2() {
        Float oldX2 = x2;
        boolean oldX2ESet = x2ESet;
        x2 = X2_EDEFAULT;
        x2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIVALENT_INJECTION__X2, oldX2, X2_EDEFAULT, oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX2() {
        return x2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReactiveCapabilityCurve getReactiveCapabilityCurve() {
        return reactiveCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReactiveCapabilityCurve( ReactiveCapabilityCurve newReactiveCapabilityCurve,
            NotificationChain msgs ) {
        ReactiveCapabilityCurve oldReactiveCapabilityCurve = reactiveCapabilityCurve;
        reactiveCapabilityCurve = newReactiveCapabilityCurve;
        boolean oldReactiveCapabilityCurveESet = reactiveCapabilityCurveESet;
        reactiveCapabilityCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE, oldReactiveCapabilityCurve,
                    newReactiveCapabilityCurve, !oldReactiveCapabilityCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReactiveCapabilityCurve( ReactiveCapabilityCurve newReactiveCapabilityCurve ) {
        if( newReactiveCapabilityCurve != reactiveCapabilityCurve ) {
            NotificationChain msgs = null;
            if( reactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) reactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION, ReactiveCapabilityCurve.class,
                        msgs );
            if( newReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) newReactiveCapabilityCurve ).eInverseAdd( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION, ReactiveCapabilityCurve.class,
                        msgs );
            msgs = basicSetReactiveCapabilityCurve( newReactiveCapabilityCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReactiveCapabilityCurveESet = reactiveCapabilityCurveESet;
            reactiveCapabilityCurveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE, newReactiveCapabilityCurve,
                    newReactiveCapabilityCurve, !oldReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReactiveCapabilityCurve( NotificationChain msgs ) {
        ReactiveCapabilityCurve oldReactiveCapabilityCurve = reactiveCapabilityCurve;
        reactiveCapabilityCurve = null;
        boolean oldReactiveCapabilityCurveESet = reactiveCapabilityCurveESet;
        reactiveCapabilityCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE, oldReactiveCapabilityCurve, null,
                    oldReactiveCapabilityCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReactiveCapabilityCurve() {
        if( reactiveCapabilityCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reactiveCapabilityCurve ).eInverseRemove( this,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION, ReactiveCapabilityCurve.class, msgs );
            msgs = basicUnsetReactiveCapabilityCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReactiveCapabilityCurveESet = reactiveCapabilityCurveESet;
            reactiveCapabilityCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE, null, null,
                    oldReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReactiveCapabilityCurve() {
        return reactiveCapabilityCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            if( reactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) reactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION, ReactiveCapabilityCurve.class,
                        msgs );
            return basicSetReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            return basicUnsetReactiveCapabilityCurve( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EQUIVALENT_INJECTION__MAX_P:
            return getMaxP();
        case CimPackage.EQUIVALENT_INJECTION__MAX_Q:
            return getMaxQ();
        case CimPackage.EQUIVALENT_INJECTION__MIN_P:
            return getMinP();
        case CimPackage.EQUIVALENT_INJECTION__MIN_Q:
            return getMinQ();
        case CimPackage.EQUIVALENT_INJECTION__P:
            return getP();
        case CimPackage.EQUIVALENT_INJECTION__Q:
            return getQ();
        case CimPackage.EQUIVALENT_INJECTION__R:
            return getR();
        case CimPackage.EQUIVALENT_INJECTION__R0:
            return getR0();
        case CimPackage.EQUIVALENT_INJECTION__R2:
            return getR2();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
            return getRegulationCapability();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
            return getRegulationStatus();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
            return getRegulationTarget();
        case CimPackage.EQUIVALENT_INJECTION__X:
            return getX();
        case CimPackage.EQUIVALENT_INJECTION__X0:
            return getX0();
        case CimPackage.EQUIVALENT_INJECTION__X2:
            return getX2();
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            return getReactiveCapabilityCurve();
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
        case CimPackage.EQUIVALENT_INJECTION__MAX_P:
            setMaxP( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__MAX_Q:
            setMaxQ( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__MIN_P:
            setMinP( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__MIN_Q:
            setMinQ( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__R2:
            setR2( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
            setRegulationCapability( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
            setRegulationStatus( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
            setRegulationTarget( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__X2:
            setX2( ( Float ) newValue );
            return;
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            setReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) newValue );
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
        case CimPackage.EQUIVALENT_INJECTION__MAX_P:
            unsetMaxP();
            return;
        case CimPackage.EQUIVALENT_INJECTION__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.EQUIVALENT_INJECTION__MIN_P:
            unsetMinP();
            return;
        case CimPackage.EQUIVALENT_INJECTION__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.EQUIVALENT_INJECTION__P:
            unsetP();
            return;
        case CimPackage.EQUIVALENT_INJECTION__Q:
            unsetQ();
            return;
        case CimPackage.EQUIVALENT_INJECTION__R:
            unsetR();
            return;
        case CimPackage.EQUIVALENT_INJECTION__R0:
            unsetR0();
            return;
        case CimPackage.EQUIVALENT_INJECTION__R2:
            unsetR2();
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
            unsetRegulationCapability();
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
            unsetRegulationStatus();
            return;
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
            unsetRegulationTarget();
            return;
        case CimPackage.EQUIVALENT_INJECTION__X:
            unsetX();
            return;
        case CimPackage.EQUIVALENT_INJECTION__X0:
            unsetX0();
            return;
        case CimPackage.EQUIVALENT_INJECTION__X2:
            unsetX2();
            return;
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            unsetReactiveCapabilityCurve();
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
        case CimPackage.EQUIVALENT_INJECTION__MAX_P:
            return isSetMaxP();
        case CimPackage.EQUIVALENT_INJECTION__MAX_Q:
            return isSetMaxQ();
        case CimPackage.EQUIVALENT_INJECTION__MIN_P:
            return isSetMinP();
        case CimPackage.EQUIVALENT_INJECTION__MIN_Q:
            return isSetMinQ();
        case CimPackage.EQUIVALENT_INJECTION__P:
            return isSetP();
        case CimPackage.EQUIVALENT_INJECTION__Q:
            return isSetQ();
        case CimPackage.EQUIVALENT_INJECTION__R:
            return isSetR();
        case CimPackage.EQUIVALENT_INJECTION__R0:
            return isSetR0();
        case CimPackage.EQUIVALENT_INJECTION__R2:
            return isSetR2();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
            return isSetRegulationCapability();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
            return isSetRegulationStatus();
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
            return isSetRegulationTarget();
        case CimPackage.EQUIVALENT_INJECTION__X:
            return isSetX();
        case CimPackage.EQUIVALENT_INJECTION__X0:
            return isSetX0();
        case CimPackage.EQUIVALENT_INJECTION__X2:
            return isSetX2();
        case CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE:
            return isSetReactiveCapabilityCurve();
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
        result.append( " (maxP: " );
        if( maxPESet )
            result.append( maxP );
        else
            result.append( "<unset>" );
        result.append( ", maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", minP: " );
        if( minPESet )
            result.append( minP );
        else
            result.append( "<unset>" );
        result.append( ", minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", r2: " );
        if( r2ESet )
            result.append( r2 );
        else
            result.append( "<unset>" );
        result.append( ", regulationCapability: " );
        if( regulationCapabilityESet )
            result.append( regulationCapability );
        else
            result.append( "<unset>" );
        result.append( ", regulationStatus: " );
        if( regulationStatusESet )
            result.append( regulationStatus );
        else
            result.append( "<unset>" );
        result.append( ", regulationTarget: " );
        if( regulationTargetESet )
            result.append( regulationTarget );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", x2: " );
        if( x2ESet )
            result.append( x2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EquivalentInjectionImpl
