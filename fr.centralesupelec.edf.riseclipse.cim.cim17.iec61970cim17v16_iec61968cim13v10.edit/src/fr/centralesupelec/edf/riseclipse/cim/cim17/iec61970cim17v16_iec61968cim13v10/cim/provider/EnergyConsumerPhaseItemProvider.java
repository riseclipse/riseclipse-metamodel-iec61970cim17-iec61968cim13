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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnergyConsumerPhaseItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnergyConsumerPhaseItemProvider( AdapterFactory adapterFactory ) {
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

            addPPropertyDescriptor( object );
            addPfixedPropertyDescriptor( object );
            addPfixedPctPropertyDescriptor( object );
            addPhasePropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addQfixedPropertyDescriptor( object );
            addQfixedPctPropertyDescriptor( object );
            addEnergyConsumerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_p_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_P(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pfixed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfixedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_pfixed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_pfixed_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_Pfixed(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pfixed Pct feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfixedPctPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_pfixedPct_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_pfixedPct_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_PfixedPct(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_phase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_phase_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_Phase(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_q_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_Q(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qfixed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQfixedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_qfixed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_qfixed_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_Qfixed(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qfixed Pct feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQfixedPctPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_qfixedPct_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumerPhase_qfixedPct_feature",
                                "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_QfixedPct(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energy Consumer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyConsumerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumerPhase_EnergyConsumer_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EnergyConsumerPhase_EnergyConsumer_feature", "_UI_EnergyConsumerPhase_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumerPhase_EnergyConsumer(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns EnergyConsumerPhase.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EnergyConsumerPhase" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EnergyConsumerPhase ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EnergyConsumerPhase_type" )
                : getString( "_UI_EnergyConsumerPhase_type" ) + " " + label;
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

        switch( notification.getFeatureID( EnergyConsumerPhase.class ) ) {
        case CimPackage.ENERGY_CONSUMER_PHASE__P:
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED:
        case CimPackage.ENERGY_CONSUMER_PHASE__PFIXED_PCT:
        case CimPackage.ENERGY_CONSUMER_PHASE__PHASE:
        case CimPackage.ENERGY_CONSUMER_PHASE__Q:
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED:
        case CimPackage.ENERGY_CONSUMER_PHASE__QFIXED_PCT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
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
