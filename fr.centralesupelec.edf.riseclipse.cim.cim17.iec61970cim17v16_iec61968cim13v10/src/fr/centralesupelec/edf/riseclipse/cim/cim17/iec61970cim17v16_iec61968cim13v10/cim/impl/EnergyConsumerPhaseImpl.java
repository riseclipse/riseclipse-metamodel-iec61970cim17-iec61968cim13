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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Consumer Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyConsumerPhaseImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyConsumerPhaseImpl extends PowerSystemResourceImpl implements EnergyConsumerPhase {
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
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

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
     * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumer()
     * @generated
     * @ordered
     */
    protected EnergyConsumer energyConsumer;

    /**
     * This is true if the Energy Consumer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyConsumerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergyConsumerPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergyConsumerPhase();
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
                CimPackage.ENERGY_CONSUMER_PHASE__P, oldP, p, !oldPESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__P, oldP, P_EDEFAULT, oldPESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__PFIXED, oldPfixed, pfixed, !oldPfixedESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__PFIXED, oldPfixed, PFIXED_EDEFAULT, oldPfixedESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT, oldPfixedPct, pfixedPct, !oldPfixedPctESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT, oldPfixedPct, PFIXED_PCT_EDEFAULT, oldPfixedPctESet ) );
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
    public SinglePhaseKind getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( SinglePhaseKind newPhase ) {
        SinglePhaseKind oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_CONSUMER_PHASE__PHASE, oldPhase, phase, !oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        SinglePhaseKind oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_CONSUMER_PHASE__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
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
                CimPackage.ENERGY_CONSUMER_PHASE__Q, oldQ, q, !oldQESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__Q, oldQ, Q_EDEFAULT, oldQESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__QFIXED, oldQfixed, qfixed, !oldQfixedESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__QFIXED, oldQfixed, QFIXED_EDEFAULT, oldQfixedESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT, oldQfixedPct, qfixedPct, !oldQfixedPctESet ) );
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
                CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT, oldQfixedPct, QFIXED_PCT_EDEFAULT, oldQfixedPctESet ) );
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
    public EnergyConsumer getEnergyConsumer() {
        return energyConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergyConsumer( EnergyConsumer newEnergyConsumer, NotificationChain msgs ) {
        EnergyConsumer oldEnergyConsumer = energyConsumer;
        energyConsumer = newEnergyConsumer;
        boolean oldEnergyConsumerESet = energyConsumerESet;
        energyConsumerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER, oldEnergyConsumer, newEnergyConsumer,
                    !oldEnergyConsumerESet );
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
    public void setEnergyConsumer( EnergyConsumer newEnergyConsumer ) {
        if( newEnergyConsumer != energyConsumer ) {
            NotificationChain msgs = null;
            if( energyConsumer != null ) msgs = ( ( InternalEObject ) energyConsumer ).eInverseRemove( this,
                    CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE, EnergyConsumer.class, msgs );
            if( newEnergyConsumer != null ) msgs = ( ( InternalEObject ) newEnergyConsumer ).eInverseAdd( this,
                    CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE, EnergyConsumer.class, msgs );
            msgs = basicSetEnergyConsumer( newEnergyConsumer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergyConsumerESet = energyConsumerESet;
            energyConsumerESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER,
                            newEnergyConsumer, newEnergyConsumer, !oldEnergyConsumerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergyConsumer( NotificationChain msgs ) {
        EnergyConsumer oldEnergyConsumer = energyConsumer;
        energyConsumer = null;
        boolean oldEnergyConsumerESet = energyConsumerESet;
        energyConsumerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER, oldEnergyConsumer, null, oldEnergyConsumerESet );
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
    public void unsetEnergyConsumer() {
        if( energyConsumer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energyConsumer ).eInverseRemove( this,
                    CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE, EnergyConsumer.class, msgs );
            msgs = basicUnsetEnergyConsumer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergyConsumerESet = energyConsumerESet;
            energyConsumerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER, null, null, oldEnergyConsumerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConsumer() {
        return energyConsumerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            if( energyConsumer != null ) msgs = ( ( InternalEObject ) energyConsumer ).eInverseRemove( this,
                    CimPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASE, EnergyConsumer.class, msgs );
            return basicSetEnergyConsumer( ( EnergyConsumer ) otherEnd, msgs );
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
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            return basicUnsetEnergyConsumer( msgs );
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
        case CimPackage.ENERGY_CONSUMER_PHASE__P:
            return getP();
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED:
            return getPfixed();
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT:
            return getPfixedPct();
        case CimPackage.ENERGY_CONSUMER_PHASE__PHASE:
            return getPhase();
        case CimPackage.ENERGY_CONSUMER_PHASE__Q:
            return getQ();
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED:
            return getQfixed();
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT:
            return getQfixedPct();
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            return getEnergyConsumer();
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
        case CimPackage.ENERGY_CONSUMER_PHASE__P:
            setP( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED:
            setPfixed( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT:
            setPfixedPct( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PHASE:
            setPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED:
            setQfixed( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT:
            setQfixedPct( ( Float ) newValue );
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            setEnergyConsumer( ( EnergyConsumer ) newValue );
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
        case CimPackage.ENERGY_CONSUMER_PHASE__P:
            unsetP();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED:
            unsetPfixed();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT:
            unsetPfixedPct();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__PHASE:
            unsetPhase();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__Q:
            unsetQ();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED:
            unsetQfixed();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT:
            unsetQfixedPct();
            return;
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            unsetEnergyConsumer();
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
        case CimPackage.ENERGY_CONSUMER_PHASE__P:
            return isSetP();
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED:
            return isSetPfixed();
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT:
            return isSetPfixedPct();
        case CimPackage.ENERGY_CONSUMER_PHASE__PHASE:
            return isSetPhase();
        case CimPackage.ENERGY_CONSUMER_PHASE__Q:
            return isSetQ();
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED:
            return isSetQfixed();
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT:
            return isSetQfixedPct();
        case CimPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
            return isSetEnergyConsumer();
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
        result.append( " (p: " );
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
        result.append( ", phase: " );
        if( phaseESet )
            result.append( phase );
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

} //EnergyConsumerPhaseImpl
