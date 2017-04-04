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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bilateral Exchange Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeAgreementImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeAgreementImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BilateralExchangeAgreementImpl extends IdentifiedObjectImpl implements BilateralExchangeAgreement {
    /**
     * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvider()
     * @generated
     * @ordered
     */
    protected BilateralExchangeActor provider;

    /**
     * This is true if the Provider reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean providerESet;

    /**
     * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumer()
     * @generated
     * @ordered
     */
    protected BilateralExchangeActor consumer;

    /**
     * This is true if the Consumer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean consumerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BilateralExchangeAgreementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBilateralExchangeAgreement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BilateralExchangeActor getProvider() {
        return provider;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProvider( BilateralExchangeActor newProvider, NotificationChain msgs ) {
        BilateralExchangeActor oldProvider = provider;
        provider = newProvider;
        boolean oldProviderESet = providerESet;
        providerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER, oldProvider, newProvider, !oldProviderESet );
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
    public void setProvider( BilateralExchangeActor newProvider ) {
        if( newProvider != provider ) {
            NotificationChain msgs = null;
            if( provider != null ) msgs = ( ( InternalEObject ) provider ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            if( newProvider != null ) msgs = ( ( InternalEObject ) newProvider ).eInverseAdd( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            msgs = basicSetProvider( newProvider, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProviderESet = providerESet;
            providerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER, newProvider, newProvider, !oldProviderESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProvider( NotificationChain msgs ) {
        BilateralExchangeActor oldProvider = provider;
        provider = null;
        boolean oldProviderESet = providerESet;
        providerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER, oldProvider, null, oldProviderESet );
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
    public void unsetProvider() {
        if( provider != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) provider ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            msgs = basicUnsetProvider( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProviderESet = providerESet;
            providerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER, null, null, oldProviderESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProvider() {
        return providerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BilateralExchangeActor getConsumer() {
        return consumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConsumer( BilateralExchangeActor newConsumer, NotificationChain msgs ) {
        BilateralExchangeActor oldConsumer = consumer;
        consumer = newConsumer;
        boolean oldConsumerESet = consumerESet;
        consumerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER, oldConsumer, newConsumer, !oldConsumerESet );
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
    public void setConsumer( BilateralExchangeActor newConsumer ) {
        if( newConsumer != consumer ) {
            NotificationChain msgs = null;
            if( consumer != null ) msgs = ( ( InternalEObject ) consumer ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            if( newConsumer != null ) msgs = ( ( InternalEObject ) newConsumer ).eInverseAdd( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            msgs = basicSetConsumer( newConsumer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConsumerESet = consumerESet;
            consumerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER, newConsumer, newConsumer, !oldConsumerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConsumer( NotificationChain msgs ) {
        BilateralExchangeActor oldConsumer = consumer;
        consumer = null;
        boolean oldConsumerESet = consumerESet;
        consumerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER, oldConsumer, null, oldConsumerESet );
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
    public void unsetConsumer() {
        if( consumer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) consumer ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            msgs = basicUnsetConsumer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConsumerESet = consumerESet;
            consumerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER, null, null, oldConsumerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConsumer() {
        return consumerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            if( provider != null ) msgs = ( ( InternalEObject ) provider ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            return basicSetProvider( ( BilateralExchangeActor ) otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            if( consumer != null ) msgs = ( ( InternalEObject ) consumer ).eInverseRemove( this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE, BilateralExchangeActor.class,
                    msgs );
            return basicSetConsumer( ( BilateralExchangeActor ) otherEnd, msgs );
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
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            return basicUnsetProvider( msgs );
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            return basicUnsetConsumer( msgs );
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
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            return getProvider();
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            return getConsumer();
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
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            setProvider( ( BilateralExchangeActor ) newValue );
            return;
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            setConsumer( ( BilateralExchangeActor ) newValue );
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
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            unsetProvider();
            return;
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            unsetConsumer();
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
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER:
            return isSetProvider();
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER:
            return isSetConsumer();
        }
        return super.eIsSet( featureID );
    }

} //BilateralExchangeAgreementImpl
