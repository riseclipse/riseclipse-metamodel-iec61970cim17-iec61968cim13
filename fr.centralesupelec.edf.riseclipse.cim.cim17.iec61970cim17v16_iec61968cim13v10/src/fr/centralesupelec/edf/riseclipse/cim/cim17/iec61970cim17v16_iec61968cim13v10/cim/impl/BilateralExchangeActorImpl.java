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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProvidedBilateralPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bilateral Exchange Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeActorImpl#getCommunicationLink <em>Communication Link</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeActorImpl#getProviderBilateralExchange <em>Provider Bilateral Exchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeActorImpl#getProvidedBilateralIOPoint <em>Provided Bilateral IO Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BilateralExchangeActorImpl#getConsumerBilateralExchange <em>Consumer Bilateral Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BilateralExchangeActorImpl extends IdentifiedObjectImpl implements BilateralExchangeActor {
    /**
     * The cached value of the '{@link #getCommunicationLink() <em>Communication Link</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunicationLink()
     * @generated
     * @ordered
     */
    protected EList< CommunicationLink > communicationLink;

    /**
     * The cached value of the '{@link #getProviderBilateralExchange() <em>Provider Bilateral Exchange</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderBilateralExchange()
     * @generated
     * @ordered
     */
    protected EList< BilateralExchangeAgreement > providerBilateralExchange;

    /**
     * The cached value of the '{@link #getProvidedBilateralIOPoint() <em>Provided Bilateral IO Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvidedBilateralIOPoint()
     * @generated
     * @ordered
     */
    protected EList< ProvidedBilateralPoint > providedBilateralIOPoint;

    /**
     * The cached value of the '{@link #getConsumerBilateralExchange() <em>Consumer Bilateral Exchange</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumerBilateralExchange()
     * @generated
     * @ordered
     */
    protected EList< BilateralExchangeAgreement > consumerBilateralExchange;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BilateralExchangeActorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBilateralExchangeActor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CommunicationLink > getCommunicationLink() {
        if( communicationLink == null ) {
            communicationLink = new EObjectWithInverseResolvingEList.Unsettable< CommunicationLink >(
                    CommunicationLink.class, this, CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK,
                    CimPackage.COMMUNICATION_LINK__BILATERAL_EXCHANGE_ACTOR );
        }
        return communicationLink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommunicationLink() {
        if( communicationLink != null ) ( ( InternalEList.Unsettable< ? > ) communicationLink ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommunicationLink() {
        return communicationLink != null && ( ( InternalEList.Unsettable< ? > ) communicationLink ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BilateralExchangeAgreement > getProviderBilateralExchange() {
        if( providerBilateralExchange == null ) {
            providerBilateralExchange = new EObjectWithInverseResolvingEList.Unsettable< BilateralExchangeAgreement >(
                    BilateralExchangeAgreement.class, this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__PROVIDER );
        }
        return providerBilateralExchange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProviderBilateralExchange() {
        if( providerBilateralExchange != null ) ( ( InternalEList.Unsettable< ? > ) providerBilateralExchange ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProviderBilateralExchange() {
        return providerBilateralExchange != null
                && ( ( InternalEList.Unsettable< ? > ) providerBilateralExchange ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProvidedBilateralPoint > getProvidedBilateralIOPoint() {
        if( providedBilateralIOPoint == null ) {
            providedBilateralIOPoint = new EObjectWithInverseResolvingEList.Unsettable< ProvidedBilateralPoint >(
                    ProvidedBilateralPoint.class, this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT,
                    CimPackage.PROVIDED_BILATERAL_POINT__BILATERAL_EXCHANGE_ACTOR );
        }
        return providedBilateralIOPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProvidedBilateralIOPoint() {
        if( providedBilateralIOPoint != null ) ( ( InternalEList.Unsettable< ? > ) providedBilateralIOPoint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProvidedBilateralIOPoint() {
        return providedBilateralIOPoint != null
                && ( ( InternalEList.Unsettable< ? > ) providedBilateralIOPoint ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BilateralExchangeAgreement > getConsumerBilateralExchange() {
        if( consumerBilateralExchange == null ) {
            consumerBilateralExchange = new EObjectWithInverseResolvingEList.Unsettable< BilateralExchangeAgreement >(
                    BilateralExchangeAgreement.class, this,
                    CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE,
                    CimPackage.BILATERAL_EXCHANGE_AGREEMENT__CONSUMER );
        }
        return consumerBilateralExchange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConsumerBilateralExchange() {
        if( consumerBilateralExchange != null ) ( ( InternalEList.Unsettable< ? > ) consumerBilateralExchange ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConsumerBilateralExchange() {
        return consumerBilateralExchange != null
                && ( ( InternalEList.Unsettable< ? > ) consumerBilateralExchange ).isSet();
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCommunicationLink() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProviderBilateralExchange() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProvidedBilateralIOPoint() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConsumerBilateralExchange() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            return ( ( InternalEList< ? > ) getCommunicationLink() ).basicRemove( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            return ( ( InternalEList< ? > ) getProviderBilateralExchange() ).basicRemove( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            return ( ( InternalEList< ? > ) getProvidedBilateralIOPoint() ).basicRemove( otherEnd, msgs );
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            return ( ( InternalEList< ? > ) getConsumerBilateralExchange() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            return getCommunicationLink();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            return getProviderBilateralExchange();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            return getProvidedBilateralIOPoint();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            return getConsumerBilateralExchange();
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            getCommunicationLink().clear();
            getCommunicationLink().addAll( ( Collection< ? extends CommunicationLink > ) newValue );
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            getProviderBilateralExchange().clear();
            getProviderBilateralExchange().addAll( ( Collection< ? extends BilateralExchangeAgreement > ) newValue );
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            getProvidedBilateralIOPoint().clear();
            getProvidedBilateralIOPoint().addAll( ( Collection< ? extends ProvidedBilateralPoint > ) newValue );
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            getConsumerBilateralExchange().clear();
            getConsumerBilateralExchange().addAll( ( Collection< ? extends BilateralExchangeAgreement > ) newValue );
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            unsetCommunicationLink();
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            unsetProviderBilateralExchange();
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            unsetProvidedBilateralIOPoint();
            return;
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            unsetConsumerBilateralExchange();
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
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__COMMUNICATION_LINK:
            return isSetCommunicationLink();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDER_BILATERAL_EXCHANGE:
            return isSetProviderBilateralExchange();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__PROVIDED_BILATERAL_IO_POINT:
            return isSetProvidedBilateralIOPoint();
        case CimPackage.BILATERAL_EXCHANGE_ACTOR__CONSUMER_BILATERAL_EXCHANGE:
            return isSetConsumerBilateralExchange();
        }
        return super.eIsSet( featureID );
    }

} //BilateralExchangeActorImpl
