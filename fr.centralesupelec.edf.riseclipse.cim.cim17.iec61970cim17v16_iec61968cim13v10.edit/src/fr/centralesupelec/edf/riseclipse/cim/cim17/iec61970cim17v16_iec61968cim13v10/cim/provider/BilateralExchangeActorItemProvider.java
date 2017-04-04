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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BilateralExchangeActor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BilateralExchangeActorItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BilateralExchangeActorItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addCommunicationLinkPropertyDescriptor( object );
            addProviderBilateralExchangePropertyDescriptor( object );
            addProvidedBilateralIOPointPropertyDescriptor( object );
            addConsumerBilateralExchangePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Communication Link feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommunicationLinkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_BilateralExchangeActor_CommunicationLink_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_BilateralExchangeActor_CommunicationLink_feature",
                        "_UI_BilateralExchangeActor_type" ),
                CimPackage.eINSTANCE.getBilateralExchangeActor_CommunicationLink(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Provider Bilateral Exchange feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProviderBilateralExchangePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_BilateralExchangeActor_ProviderBilateralExchange_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_BilateralExchangeActor_ProviderBilateralExchange_feature",
                        "_UI_BilateralExchangeActor_type" ),
                CimPackage.eINSTANCE.getBilateralExchangeActor_ProviderBilateralExchange(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Provided Bilateral IO Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProvidedBilateralIOPointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_BilateralExchangeActor_ProvidedBilateralIOPoint_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_BilateralExchangeActor_ProvidedBilateralIOPoint_feature",
                        "_UI_BilateralExchangeActor_type" ),
                CimPackage.eINSTANCE.getBilateralExchangeActor_ProvidedBilateralIOPoint(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Consumer Bilateral Exchange feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumerBilateralExchangePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_BilateralExchangeActor_ConsumerBilateralExchange_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_BilateralExchangeActor_ConsumerBilateralExchange_feature",
                        "_UI_BilateralExchangeActor_type" ),
                CimPackage.eINSTANCE.getBilateralExchangeActor_ConsumerBilateralExchange(), true, false, true, null,
                null, null ) );
    }

    /**
     * This returns BilateralExchangeActor.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BilateralExchangeActor" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BilateralExchangeActor ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_BilateralExchangeActor_type" )
                : getString( "_UI_BilateralExchangeActor_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
