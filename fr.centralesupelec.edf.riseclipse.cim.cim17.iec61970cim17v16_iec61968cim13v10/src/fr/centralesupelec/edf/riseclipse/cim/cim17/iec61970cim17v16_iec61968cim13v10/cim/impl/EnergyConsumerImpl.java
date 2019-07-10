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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getPhaseConnection <em>Phase Connection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getEnergyConsumerPhase <em>Energy Consumer Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getLoadDynamics <em>Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerImpl#getPowerCutZone <em>Power Cut Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyConsumerImpl extends EnergyConnectionImpl implements EnergyConsumer {
    /**
     * The default value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerCount()
     * @generated
     * @ordered
     */
    protected static final Integer CUSTOMER_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerCount()
     * @generated
     * @ordered
     */
    protected Integer customerCount = CUSTOMER_COUNT_EDEFAULT;

    /**
     * This is true if the Customer Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerCountESet;

    /**
     * The default value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected Boolean grounded = GROUNDED_EDEFAULT;

    /**
     * This is true if the Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedESet;

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
     * The default value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfixed()
     * @generated
     * @ordered
     */
    protected static final Float PFIXED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfixed()
     * @generated
     * @ordered
     */
    protected Float pfixed = PFIXED_EDEFAULT;

    /**
     * This is true if the Pfixed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfixedESet;

    /**
     * The default value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfixedPct()
     * @generated
     * @ordered
     */
    protected static final Float PFIXED_PCT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfixedPct()
     * @generated
     * @ordered
     */
    protected Float pfixedPct = PFIXED_PCT_EDEFAULT;

    /**
     * This is true if the Pfixed Pct attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfixedPctESet;

    /**
     * The default value of the '{@link #getPhaseConnection() <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseConnection()
     * @generated
     * @ordered
     */
    protected static final PhaseShuntConnectionKind PHASE_CONNECTION_EDEFAULT = PhaseShuntConnectionKind.D;

    /**
     * The cached value of the '{@link #getPhaseConnection() <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseConnection()
     * @generated
     * @ordered
     */
    protected PhaseShuntConnectionKind phaseConnection = PHASE_CONNECTION_EDEFAULT;

    /**
     * This is true if the Phase Connection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseConnectionESet;

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
     * The default value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQfixed()
     * @generated
     * @ordered
     */
    protected static final Float QFIXED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQfixed()
     * @generated
     * @ordered
     */
    protected Float qfixed = QFIXED_EDEFAULT;

    /**
     * This is true if the Qfixed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qfixedESet;

    /**
     * The default value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQfixedPct()
     * @generated
     * @ordered
     */
    protected static final Float QFIXED_PCT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQfixedPct()
     * @generated
     * @ordered
     */
    protected Float qfixedPct = QFIXED_PCT_EDEFAULT;

    /**
     * This is true if the Qfixed Pct attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qfixedPctESet;

    /**
     * The cached value of the '{@link #getEnergyConsumerPhase() <em>Energy Consumer Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumerPhase()
     * @generated
     * @ordered
     */
    protected EList< EnergyConsumerPhase > energyConsumerPhase;

    /**
     * The cached value of the '{@link #getLoadResponse() <em>Load Response</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadResponse()
     * @generated
     * @ordered
     */
    protected LoadResponseCharacteristic loadResponse;

    /**
     * This is true if the Load Response reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadResponseESet;

    /**
     * The cached value of the '{@link #getLoadDynamics() <em>Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadDynamics()
     * @generated
     * @ordered
     */
    protected LoadDynamics loadDynamics;

    /**
     * This is true if the Load Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadDynamicsESet;

    /**
     * The cached value of the '{@link #getPowerCutZone() <em>Power Cut Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerCutZone()
     * @generated
     * @ordered
     */
    protected PowerCutZone powerCutZone;

    /**
     * This is true if the Power Cut Zone reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerCutZoneESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergyConsumerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergyConsumer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCustomerCount() {
        return customerCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomerCount( Integer newCustomerCount ) {
        Integer oldCustomerCount = customerCount;
        customerCount = newCustomerCount;
        boolean oldCustomerCountESet = customerCountESet;
        customerCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT, oldCustomerCount, customerCount, !oldCustomerCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerCount() {
        Integer oldCustomerCount = customerCount;
        boolean oldCustomerCountESet = customerCountESet;
        customerCount = CUSTOMER_COUNT_EDEFAULT;
        customerCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT,
                    oldCustomerCount, CUSTOMER_COUNT_EDEFAULT, oldCustomerCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerCount() {
        return customerCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGrounded() {
        return grounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrounded( Boolean newGrounded ) {
        Boolean oldGrounded = grounded;
        grounded = newGrounded;
        boolean oldGroundedESet = groundedESet;
        groundedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__GROUNDED, oldGrounded, grounded, !oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrounded() {
        Boolean oldGrounded = grounded;
        boolean oldGroundedESet = groundedESet;
        grounded = GROUNDED_EDEFAULT;
        groundedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER__GROUNDED, oldGrounded, GROUNDED_EDEFAULT, oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrounded() {
        return groundedESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__P, oldP, p, !oldPESet ) );
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
                CimPackage.ENERGY_CONSUMER__P, oldP, P_EDEFAULT, oldPESet ) );
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
    public Float getPfixed() {
        return pfixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPfixed( Float newPfixed ) {
        Float oldPfixed = pfixed;
        pfixed = newPfixed;
        boolean oldPfixedESet = pfixedESet;
        pfixedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__PFIXED, oldPfixed, pfixed, !oldPfixedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPfixed() {
        Float oldPfixed = pfixed;
        boolean oldPfixedESet = pfixedESet;
        pfixed = PFIXED_EDEFAULT;
        pfixedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER__PFIXED, oldPfixed, PFIXED_EDEFAULT, oldPfixedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPfixed() {
        return pfixedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPfixedPct() {
        return pfixedPct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPfixedPct( Float newPfixedPct ) {
        Float oldPfixedPct = pfixedPct;
        pfixedPct = newPfixedPct;
        boolean oldPfixedPctESet = pfixedPctESet;
        pfixedPctESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__PFIXED_PCT, oldPfixedPct, pfixedPct, !oldPfixedPctESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPfixedPct() {
        Float oldPfixedPct = pfixedPct;
        boolean oldPfixedPctESet = pfixedPctESet;
        pfixedPct = PFIXED_PCT_EDEFAULT;
        pfixedPctESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER__PFIXED_PCT, oldPfixedPct, PFIXED_PCT_EDEFAULT, oldPfixedPctESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPfixedPct() {
        return pfixedPctESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseShuntConnectionKind getPhaseConnection() {
        return phaseConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseConnection( PhaseShuntConnectionKind newPhaseConnection ) {
        PhaseShuntConnectionKind oldPhaseConnection = phaseConnection;
        phaseConnection = newPhaseConnection == null ? PHASE_CONNECTION_EDEFAULT : newPhaseConnection;
        boolean oldPhaseConnectionESet = phaseConnectionESet;
        phaseConnectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION,
                    oldPhaseConnection, phaseConnection, !oldPhaseConnectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseConnection() {
        PhaseShuntConnectionKind oldPhaseConnection = phaseConnection;
        boolean oldPhaseConnectionESet = phaseConnectionESet;
        phaseConnection = PHASE_CONNECTION_EDEFAULT;
        phaseConnectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION,
                    oldPhaseConnection, PHASE_CONNECTION_EDEFAULT, oldPhaseConnectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseConnection() {
        return phaseConnectionESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__Q, oldQ, q, !oldQESet ) );
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
                CimPackage.ENERGY_CONSUMER__Q, oldQ, Q_EDEFAULT, oldQESet ) );
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
    public Float getQfixed() {
        return qfixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQfixed( Float newQfixed ) {
        Float oldQfixed = qfixed;
        qfixed = newQfixed;
        boolean oldQfixedESet = qfixedESet;
        qfixedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__QFIXED, oldQfixed, qfixed, !oldQfixedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQfixed() {
        Float oldQfixed = qfixed;
        boolean oldQfixedESet = qfixedESet;
        qfixed = QFIXED_EDEFAULT;
        qfixedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER__QFIXED, oldQfixed, QFIXED_EDEFAULT, oldQfixedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQfixed() {
        return qfixedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQfixedPct() {
        return qfixedPct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQfixedPct( Float newQfixedPct ) {
        Float oldQfixedPct = qfixedPct;
        qfixedPct = newQfixedPct;
        boolean oldQfixedPctESet = qfixedPctESet;
        qfixedPctESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER__QFIXED_PCT, oldQfixedPct, qfixedPct, !oldQfixedPctESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQfixedPct() {
        Float oldQfixedPct = qfixedPct;
        boolean oldQfixedPctESet = qfixedPctESet;
        qfixedPct = QFIXED_PCT_EDEFAULT;
        qfixedPctESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER__QFIXED_PCT, oldQfixedPct, QFIXED_PCT_EDEFAULT, oldQfixedPctESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQfixedPct() {
        return qfixedPctESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnergyConsumerPhase > getEnergyConsumerPhase() {
        if( energyConsumerPhase == null ) {
            energyConsumerPhase = new EObjectWithInverseResolvingEList.Unsettable< EnergyConsumerPhase >(
                    EnergyConsumerPhase.class, this, CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE,
                    CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER );
        }
        return energyConsumerPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyConsumerPhase() {
        if( energyConsumerPhase != null ) ( ( InternalEList.Unsettable< ? > ) energyConsumerPhase ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConsumerPhase() {
        return energyConsumerPhase != null && ( ( InternalEList.Unsettable< ? > ) energyConsumerPhase ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadResponseCharacteristic getLoadResponse() {
        return loadResponse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadResponse( LoadResponseCharacteristic newLoadResponse,
            NotificationChain msgs ) {
        LoadResponseCharacteristic oldLoadResponse = loadResponse;
        loadResponse = newLoadResponse;
        boolean oldLoadResponseESet = loadResponseESet;
        loadResponseESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, newLoadResponse, !oldLoadResponseESet );
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
    public void setLoadResponse( LoadResponseCharacteristic newLoadResponse ) {
        if( newLoadResponse != loadResponse ) {
            NotificationChain msgs = null;
            if( loadResponse != null ) msgs = ( ( InternalEObject ) loadResponse ).eInverseRemove( this,
                    CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs );
            if( newLoadResponse != null ) msgs = ( ( InternalEObject ) newLoadResponse ).eInverseAdd( this,
                    CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs );
            msgs = basicSetLoadResponse( newLoadResponse, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadResponseESet = loadResponseESet;
            loadResponseESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE,
                        newLoadResponse, newLoadResponse, !oldLoadResponseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadResponse( NotificationChain msgs ) {
        LoadResponseCharacteristic oldLoadResponse = loadResponse;
        loadResponse = null;
        boolean oldLoadResponseESet = loadResponseESet;
        loadResponseESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE, oldLoadResponse, null, oldLoadResponseESet );
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
    public void unsetLoadResponse() {
        if( loadResponse != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadResponse ).eInverseRemove( this,
                    CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs );
            msgs = basicUnsetLoadResponse( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadResponseESet = loadResponseESet;
            loadResponseESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE, null, null, oldLoadResponseESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadResponse() {
        return loadResponseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadDynamics getLoadDynamics() {
        return loadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadDynamics( LoadDynamics newLoadDynamics, NotificationChain msgs ) {
        LoadDynamics oldLoadDynamics = loadDynamics;
        loadDynamics = newLoadDynamics;
        boolean oldLoadDynamicsESet = loadDynamicsESet;
        loadDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS, oldLoadDynamics, newLoadDynamics, !oldLoadDynamicsESet );
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
    public void setLoadDynamics( LoadDynamics newLoadDynamics ) {
        if( newLoadDynamics != loadDynamics ) {
            NotificationChain msgs = null;
            if( loadDynamics != null ) msgs = ( ( InternalEObject ) loadDynamics ).eInverseRemove( this,
                    CimPackage.LOAD_DYNAMICS__ENERGY_CONSUMER, LoadDynamics.class, msgs );
            if( newLoadDynamics != null ) msgs = ( ( InternalEObject ) newLoadDynamics ).eInverseAdd( this,
                    CimPackage.LOAD_DYNAMICS__ENERGY_CONSUMER, LoadDynamics.class, msgs );
            msgs = basicSetLoadDynamics( newLoadDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadDynamicsESet = loadDynamicsESet;
            loadDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS,
                        newLoadDynamics, newLoadDynamics, !oldLoadDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadDynamics( NotificationChain msgs ) {
        LoadDynamics oldLoadDynamics = loadDynamics;
        loadDynamics = null;
        boolean oldLoadDynamicsESet = loadDynamicsESet;
        loadDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS, oldLoadDynamics, null, oldLoadDynamicsESet );
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
    public void unsetLoadDynamics() {
        if( loadDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadDynamics ).eInverseRemove( this, CimPackage.LOAD_DYNAMICS__ENERGY_CONSUMER,
                    LoadDynamics.class, msgs );
            msgs = basicUnsetLoadDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadDynamicsESet = loadDynamicsESet;
            loadDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS, null, null, oldLoadDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadDynamics() {
        return loadDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerCutZone getPowerCutZone() {
        return powerCutZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerCutZone( PowerCutZone newPowerCutZone, NotificationChain msgs ) {
        PowerCutZone oldPowerCutZone = powerCutZone;
        powerCutZone = newPowerCutZone;
        boolean oldPowerCutZoneESet = powerCutZoneESet;
        powerCutZoneESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, oldPowerCutZone, newPowerCutZone,
                    !oldPowerCutZoneESet );
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
    public void setPowerCutZone( PowerCutZone newPowerCutZone ) {
        if( newPowerCutZone != powerCutZone ) {
            NotificationChain msgs = null;
            if( powerCutZone != null ) msgs = ( ( InternalEObject ) powerCutZone ).eInverseRemove( this,
                    CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs );
            if( newPowerCutZone != null ) msgs = ( ( InternalEObject ) newPowerCutZone ).eInverseAdd( this,
                    CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs );
            msgs = basicSetPowerCutZone( newPowerCutZone, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerCutZoneESet = powerCutZoneESet;
            powerCutZoneESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE,
                        newPowerCutZone, newPowerCutZone, !oldPowerCutZoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerCutZone( NotificationChain msgs ) {
        PowerCutZone oldPowerCutZone = powerCutZone;
        powerCutZone = null;
        boolean oldPowerCutZoneESet = powerCutZoneESet;
        powerCutZoneESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, oldPowerCutZone, null, oldPowerCutZoneESet );
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
    public void unsetPowerCutZone() {
        if( powerCutZone != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerCutZone ).eInverseRemove( this,
                    CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs );
            msgs = basicUnsetPowerCutZone( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerCutZoneESet = powerCutZoneESet;
            powerCutZoneESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE, null, null, oldPowerCutZoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerCutZone() {
        return powerCutZoneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergyConsumerPhase() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            if( loadResponse != null ) msgs = ( ( InternalEObject ) loadResponse ).eInverseRemove( this,
                    CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs );
            return basicSetLoadResponse( ( LoadResponseCharacteristic ) otherEnd, msgs );
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            if( loadDynamics != null ) msgs = ( ( InternalEObject ) loadDynamics ).eInverseRemove( this,
                    CimPackage.LOAD_DYNAMICS__ENERGY_CONSUMER, LoadDynamics.class, msgs );
            return basicSetLoadDynamics( ( LoadDynamics ) otherEnd, msgs );
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            if( powerCutZone != null ) msgs = ( ( InternalEObject ) powerCutZone ).eInverseRemove( this,
                    CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs );
            return basicSetPowerCutZone( ( PowerCutZone ) otherEnd, msgs );
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
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            return ( ( InternalEList< ? > ) getEnergyConsumerPhase() ).basicRemove( otherEnd, msgs );
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            return basicUnsetLoadResponse( msgs );
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            return basicUnsetLoadDynamics( msgs );
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            return basicUnsetPowerCutZone( msgs );
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
        case CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
            return getCustomerCount();
        case CimPackage.ENERGY_CONSUMER__GROUNDED:
            return getGrounded();
        case CimPackage.ENERGY_CONSUMER__P:
            return getP();
        case CimPackage.ENERGY_CONSUMER__PFIXED:
            return getPfixed();
        case CimPackage.ENERGY_CONSUMER__PFIXED_PCT:
            return getPfixedPct();
        case CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION:
            return getPhaseConnection();
        case CimPackage.ENERGY_CONSUMER__Q:
            return getQ();
        case CimPackage.ENERGY_CONSUMER__QFIXED:
            return getQfixed();
        case CimPackage.ENERGY_CONSUMER__QFIXED_PCT:
            return getQfixedPct();
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            return getEnergyConsumerPhase();
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            return getLoadResponse();
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            return getLoadDynamics();
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            return getPowerCutZone();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
            setCustomerCount( ( Integer ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__PFIXED:
            setPfixed( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__PFIXED_PCT:
            setPfixedPct( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION:
            setPhaseConnection( ( PhaseShuntConnectionKind ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__QFIXED:
            setQfixed( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__QFIXED_PCT:
            setQfixedPct( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            getEnergyConsumerPhase().clear();
            getEnergyConsumerPhase().addAll( ( Collection< ? extends EnergyConsumerPhase > ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            setLoadResponse( ( LoadResponseCharacteristic ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            setLoadDynamics( ( LoadDynamics ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            setPowerCutZone( ( PowerCutZone ) newValue );
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
        case CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
            unsetCustomerCount();
            return;
        case CimPackage.ENERGY_CONSUMER__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.ENERGY_CONSUMER__P:
            unsetP();
            return;
        case CimPackage.ENERGY_CONSUMER__PFIXED:
            unsetPfixed();
            return;
        case CimPackage.ENERGY_CONSUMER__PFIXED_PCT:
            unsetPfixedPct();
            return;
        case CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION:
            unsetPhaseConnection();
            return;
        case CimPackage.ENERGY_CONSUMER__Q:
            unsetQ();
            return;
        case CimPackage.ENERGY_CONSUMER__QFIXED:
            unsetQfixed();
            return;
        case CimPackage.ENERGY_CONSUMER__QFIXED_PCT:
            unsetQfixedPct();
            return;
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            unsetEnergyConsumerPhase();
            return;
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            unsetLoadResponse();
            return;
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            unsetLoadDynamics();
            return;
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            unsetPowerCutZone();
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
        case CimPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
            return isSetCustomerCount();
        case CimPackage.ENERGY_CONSUMER__GROUNDED:
            return isSetGrounded();
        case CimPackage.ENERGY_CONSUMER__P:
            return isSetP();
        case CimPackage.ENERGY_CONSUMER__PFIXED:
            return isSetPfixed();
        case CimPackage.ENERGY_CONSUMER__PFIXED_PCT:
            return isSetPfixedPct();
        case CimPackage.ENERGY_CONSUMER__PHASE_CONNECTION:
            return isSetPhaseConnection();
        case CimPackage.ENERGY_CONSUMER__Q:
            return isSetQ();
        case CimPackage.ENERGY_CONSUMER__QFIXED:
            return isSetQfixed();
        case CimPackage.ENERGY_CONSUMER__QFIXED_PCT:
            return isSetQfixedPct();
        case CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE:
            return isSetEnergyConsumerPhase();
        case CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
            return isSetLoadResponse();
        case CimPackage.ENERGY_CONSUMER__LOAD_DYNAMICS:
            return isSetLoadDynamics();
        case CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
            return isSetPowerCutZone();
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
        result.append( " (customerCount: " );
        if( customerCountESet )
            result.append( customerCount );
        else
            result.append( "<unset>" );
        result.append( ", grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", pfixed: " );
        if( pfixedESet )
            result.append( pfixed );
        else
            result.append( "<unset>" );
        result.append( ", pfixedPct: " );
        if( pfixedPctESet )
            result.append( pfixedPct );
        else
            result.append( "<unset>" );
        result.append( ", phaseConnection: " );
        if( phaseConnectionESet )
            result.append( phaseConnection );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", qfixed: " );
        if( qfixedESet )
            result.append( qfixed );
        else
            result.append( "<unset>" );
        result.append( ", qfixedPct: " );
        if( qfixedPctESet )
            result.append( qfixedPct );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EnergyConsumerImpl
