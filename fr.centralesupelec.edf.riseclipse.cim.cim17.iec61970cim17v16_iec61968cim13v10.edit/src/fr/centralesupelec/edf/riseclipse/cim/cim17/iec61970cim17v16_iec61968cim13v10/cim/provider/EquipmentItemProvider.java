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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EquipmentItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EquipmentItemProvider( AdapterFactory adapterFactory ) {
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

            addAggregatePropertyDescriptor( object );
            addInServicePropertyDescriptor( object );
            addNormallyInServicePropertyDescriptor( object );
            addContingencyEquipmentPropertyDescriptor( object );
            addFaultsPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
            addOperationalRestrictionsPropertyDescriptor( object );
            addEquipmentContainerPropertyDescriptor( object );
            addOutagesPropertyDescriptor( object );
            addOperationalLimitSetPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aggregate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAggregatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_aggregate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_aggregate_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_Aggregate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the In Service feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInServicePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_inService_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_inService_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_InService(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Normally In Service feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormallyInServicePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_normallyInService_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_normallyInService_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_NormallyInService(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Contingency Equipment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContingencyEquipmentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_ContingencyEquipment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_ContingencyEquipment_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_ContingencyEquipment(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Faults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFaultsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_Faults_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_Faults_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_Faults(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_UsagePoints_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_UsagePoints(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operational Restrictions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalRestrictionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_Equipment_OperationalRestrictions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_OperationalRestrictions_feature",
                        "_UI_Equipment_type" ),
                CimPackage.eINSTANCE.getEquipment_OperationalRestrictions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Equipment Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquipmentContainerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_EquipmentContainer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_EquipmentContainer_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_EquipmentContainer(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outages feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutagesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_Outages_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_Outages_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_Outages(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operational Limit Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalLimitSetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Equipment_OperationalLimitSet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Equipment_OperationalLimitSet_feature",
                                "_UI_Equipment_type" ),
                        CimPackage.eINSTANCE.getEquipment_OperationalLimitSet(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns Equipment.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Equipment" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Equipment ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Equipment_type" )
                : getString( "_UI_Equipment_type" ) + " " + label;
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

        switch( notification.getFeatureID( Equipment.class ) ) {
        case CimPackage.EQUIPMENT__AGGREGATE:
        case CimPackage.EQUIPMENT__IN_SERVICE:
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
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
