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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NoLoadTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Load Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getExcitingCurrent <em>Exciting Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getExcitingCurrentZero <em>Exciting Current Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NoLoadTestImpl#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoLoadTestImpl extends TransformerTestImpl implements NoLoadTest {
    /**
     * The default value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndVoltage()
     * @generated
     * @ordered
     */
    protected static final Float ENERGISED_END_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndVoltage()
     * @generated
     * @ordered
     */
    protected Float energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Energised End Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndVoltageESet;

    /**
     * The default value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitingCurrent()
     * @generated
     * @ordered
     */
    protected static final Float EXCITING_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitingCurrent()
     * @generated
     * @ordered
     */
    protected Float excitingCurrent = EXCITING_CURRENT_EDEFAULT;

    /**
     * This is true if the Exciting Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excitingCurrentESet;

    /**
     * The default value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitingCurrentZero()
     * @generated
     * @ordered
     */
    protected static final Float EXCITING_CURRENT_ZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitingCurrentZero()
     * @generated
     * @ordered
     */
    protected Float excitingCurrentZero = EXCITING_CURRENT_ZERO_EDEFAULT;

    /**
     * This is true if the Exciting Current Zero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excitingCurrentZeroESet;

    /**
     * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoss()
     * @generated
     * @ordered
     */
    protected static final Float LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoss() <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoss()
     * @generated
     * @ordered
     */
    protected Float loss = LOSS_EDEFAULT;

    /**
     * This is true if the Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lossESet;

    /**
     * The default value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLossZero()
     * @generated
     * @ordered
     */
    protected static final Float LOSS_ZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLossZero()
     * @generated
     * @ordered
     */
    protected Float lossZero = LOSS_ZERO_EDEFAULT;

    /**
     * This is true if the Loss Zero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lossZeroESet;

    /**
     * The cached value of the '{@link #getEnergisedEnd() <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEnd()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo energisedEnd;

    /**
     * This is true if the Energised End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NoLoadTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNoLoadTest();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergisedEndVoltage() {
        return energisedEndVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergisedEndVoltage( Float newEnergisedEndVoltage ) {
        Float oldEnergisedEndVoltage = energisedEndVoltage;
        energisedEndVoltage = newEnergisedEndVoltage;
        boolean oldEnergisedEndVoltageESet = energisedEndVoltageESet;
        energisedEndVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE,
                    oldEnergisedEndVoltage, energisedEndVoltage, !oldEnergisedEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndVoltage() {
        Float oldEnergisedEndVoltage = energisedEndVoltage;
        boolean oldEnergisedEndVoltageESet = energisedEndVoltageESet;
        energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;
        energisedEndVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE,
                    oldEnergisedEndVoltage, ENERGISED_END_VOLTAGE_EDEFAULT, oldEnergisedEndVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndVoltage() {
        return energisedEndVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getExcitingCurrent() {
        return excitingCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExcitingCurrent( Float newExcitingCurrent ) {
        Float oldExcitingCurrent = excitingCurrent;
        excitingCurrent = newExcitingCurrent;
        boolean oldExcitingCurrentESet = excitingCurrentESet;
        excitingCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NO_LOAD_TEST__EXCITING_CURRENT,
                    oldExcitingCurrent, excitingCurrent, !oldExcitingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExcitingCurrent() {
        Float oldExcitingCurrent = excitingCurrent;
        boolean oldExcitingCurrentESet = excitingCurrentESet;
        excitingCurrent = EXCITING_CURRENT_EDEFAULT;
        excitingCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NO_LOAD_TEST__EXCITING_CURRENT,
                    oldExcitingCurrent, EXCITING_CURRENT_EDEFAULT, oldExcitingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExcitingCurrent() {
        return excitingCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getExcitingCurrentZero() {
        return excitingCurrentZero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExcitingCurrentZero( Float newExcitingCurrentZero ) {
        Float oldExcitingCurrentZero = excitingCurrentZero;
        excitingCurrentZero = newExcitingCurrentZero;
        boolean oldExcitingCurrentZeroESet = excitingCurrentZeroESet;
        excitingCurrentZeroESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO,
                    oldExcitingCurrentZero, excitingCurrentZero, !oldExcitingCurrentZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExcitingCurrentZero() {
        Float oldExcitingCurrentZero = excitingCurrentZero;
        boolean oldExcitingCurrentZeroESet = excitingCurrentZeroESet;
        excitingCurrentZero = EXCITING_CURRENT_ZERO_EDEFAULT;
        excitingCurrentZeroESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO,
                    oldExcitingCurrentZero, EXCITING_CURRENT_ZERO_EDEFAULT, oldExcitingCurrentZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExcitingCurrentZero() {
        return excitingCurrentZeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLoss() {
        return loss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoss( Float newLoss ) {
        Float oldLoss = loss;
        loss = newLoss;
        boolean oldLossESet = lossESet;
        lossESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NO_LOAD_TEST__LOSS, oldLoss, loss, !oldLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoss() {
        Float oldLoss = loss;
        boolean oldLossESet = lossESet;
        loss = LOSS_EDEFAULT;
        lossESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NO_LOAD_TEST__LOSS, oldLoss, LOSS_EDEFAULT, oldLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoss() {
        return lossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLossZero() {
        return lossZero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLossZero( Float newLossZero ) {
        Float oldLossZero = lossZero;
        lossZero = newLossZero;
        boolean oldLossZeroESet = lossZeroESet;
        lossZeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NO_LOAD_TEST__LOSS_ZERO, oldLossZero, lossZero, !oldLossZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLossZero() {
        Float oldLossZero = lossZero;
        boolean oldLossZeroESet = lossZeroESet;
        lossZero = LOSS_ZERO_EDEFAULT;
        lossZeroESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NO_LOAD_TEST__LOSS_ZERO, oldLossZero, LOSS_ZERO_EDEFAULT, oldLossZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLossZero() {
        return lossZeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getEnergisedEnd() {
        return energisedEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergisedEnd( TransformerEndInfo newEnergisedEnd, NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = newEnergisedEnd;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NO_LOAD_TEST__ENERGISED_END, oldEnergisedEnd, newEnergisedEnd, !oldEnergisedEndESet );
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
    public void setEnergisedEnd( TransformerEndInfo newEnergisedEnd ) {
        if( newEnergisedEnd != energisedEnd ) {
            NotificationChain msgs = null;
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS, TransformerEndInfo.class, msgs );
            if( newEnergisedEnd != null ) msgs = ( ( InternalEObject ) newEnergisedEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicSetEnergisedEnd( newEnergisedEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.NO_LOAD_TEST__ENERGISED_END, newEnergisedEnd, newEnergisedEnd, !oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergisedEnd( NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = null;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NO_LOAD_TEST__ENERGISED_END, oldEnergisedEnd, null, oldEnergisedEndESet );
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
    public void unsetEnergisedEnd() {
        if( energisedEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS, TransformerEndInfo.class, msgs );
            msgs = basicUnsetEnergisedEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NO_LOAD_TEST__ENERGISED_END, null, null, oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEnd() {
        return energisedEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TESTS, TransformerEndInfo.class, msgs );
            return basicSetEnergisedEnd( ( TransformerEndInfo ) otherEnd, msgs );
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
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            return basicUnsetEnergisedEnd( msgs );
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
        case CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
            return getEnergisedEndVoltage();
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT:
            return getExcitingCurrent();
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
            return getExcitingCurrentZero();
        case CimPackage.NO_LOAD_TEST__LOSS:
            return getLoss();
        case CimPackage.NO_LOAD_TEST__LOSS_ZERO:
            return getLossZero();
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            return getEnergisedEnd();
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
        case CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
            setEnergisedEndVoltage( ( Float ) newValue );
            return;
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT:
            setExcitingCurrent( ( Float ) newValue );
            return;
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
            setExcitingCurrentZero( ( Float ) newValue );
            return;
        case CimPackage.NO_LOAD_TEST__LOSS:
            setLoss( ( Float ) newValue );
            return;
        case CimPackage.NO_LOAD_TEST__LOSS_ZERO:
            setLossZero( ( Float ) newValue );
            return;
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            setEnergisedEnd( ( TransformerEndInfo ) newValue );
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
        case CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
            unsetEnergisedEndVoltage();
            return;
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT:
            unsetExcitingCurrent();
            return;
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
            unsetExcitingCurrentZero();
            return;
        case CimPackage.NO_LOAD_TEST__LOSS:
            unsetLoss();
            return;
        case CimPackage.NO_LOAD_TEST__LOSS_ZERO:
            unsetLossZero();
            return;
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            unsetEnergisedEnd();
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
        case CimPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
            return isSetEnergisedEndVoltage();
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT:
            return isSetExcitingCurrent();
        case CimPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
            return isSetExcitingCurrentZero();
        case CimPackage.NO_LOAD_TEST__LOSS:
            return isSetLoss();
        case CimPackage.NO_LOAD_TEST__LOSS_ZERO:
            return isSetLossZero();
        case CimPackage.NO_LOAD_TEST__ENERGISED_END:
            return isSetEnergisedEnd();
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
        result.append( " (energisedEndVoltage: " );
        if( energisedEndVoltageESet )
            result.append( energisedEndVoltage );
        else
            result.append( "<unset>" );
        result.append( ", excitingCurrent: " );
        if( excitingCurrentESet )
            result.append( excitingCurrent );
        else
            result.append( "<unset>" );
        result.append( ", excitingCurrentZero: " );
        if( excitingCurrentZeroESet )
            result.append( excitingCurrentZero );
        else
            result.append( "<unset>" );
        result.append( ", loss: " );
        if( lossESet )
            result.append( loss );
        else
            result.append( "<unset>" );
        result.append( ", lossZero: " );
        if( lossZeroESet )
            result.append( lossZero );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NoLoadTestImpl
