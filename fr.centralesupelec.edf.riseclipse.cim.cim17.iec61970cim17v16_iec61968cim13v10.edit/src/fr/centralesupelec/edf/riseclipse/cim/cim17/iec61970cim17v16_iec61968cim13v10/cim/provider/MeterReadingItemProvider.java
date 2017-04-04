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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeterReadingItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeterReadingItemProvider( AdapterFactory adapterFactory ) {
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

            addIsCoincidentTriggerPropertyDescriptor( object );
            addCustomerAgreementPropertyDescriptor( object );
            addIntervalBlocksPropertyDescriptor( object );
            addUsagePointPropertyDescriptor( object );
            addEndDeviceEventsPropertyDescriptor( object );
            addReadingsPropertyDescriptor( object );
            addMeterPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Coincident Trigger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsCoincidentTriggerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_isCoincidentTrigger_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_isCoincidentTrigger_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_IsCoincidentTrigger(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_CustomerAgreement_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_CustomerAgreement_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_CustomerAgreement(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Interval Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntervalBlocksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_IntervalBlocks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_IntervalBlocks_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_IntervalBlocks(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_UsagePoint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_UsagePoint_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_UsagePoint(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_EndDeviceEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_EndDeviceEvents_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_EndDeviceEvents(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Readings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_Readings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_Readings_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_Readings(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Meter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeterReading_Meter_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeterReading_Meter_feature",
                                "_UI_MeterReading_type" ),
                        CimPackage.eINSTANCE.getMeterReading_Meter(), true, false, true, null, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getMeterReading_ValuesInterval() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns MeterReading.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/MeterReading" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( MeterReading ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_MeterReading_type" )
                : getString( "_UI_MeterReading_type" ) + " " + label;
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

        switch( notification.getFeatureID( MeterReading.class ) ) {
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.METER_READING__VALUES_INTERVAL:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getMeterReading_ValuesInterval(),
                CimFactory.eINSTANCE.createDateTimeInterval() ) );
    }

}
