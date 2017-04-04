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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EndDeviceControlItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceControlItemProvider( AdapterFactory adapterFactory ) {
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

            addDrProgramLevelPropertyDescriptor( object );
            addDrProgramMandatoryPropertyDescriptor( object );
            addIssuerIDPropertyDescriptor( object );
            addIssuerTrackingIDPropertyDescriptor( object );
            addReasonPropertyDescriptor( object );
            addEndDeviceGroupsPropertyDescriptor( object );
            addEndDeviceControlTypePropertyDescriptor( object );
            addUsagePointGroupsPropertyDescriptor( object );
            addEndDeviceActionPropertyDescriptor( object );
            addEndDevicesPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dr Program Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDrProgramLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_drProgramLevel_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_drProgramLevel_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_DrProgramLevel(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dr Program Mandatory feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDrProgramMandatoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_drProgramMandatory_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_drProgramMandatory_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_DrProgramMandatory(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Issuer ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuerIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceControl_issuerID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_issuerID_feature",
                                "_UI_EndDeviceControl_type" ),
                        CimPackage.eINSTANCE.getEndDeviceControl_IssuerID(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Issuer Tracking ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuerTrackingIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_issuerTrackingID_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_issuerTrackingID_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_IssuerTrackingID(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reason feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReasonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceControl_reason_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_reason_feature",
                                "_UI_EndDeviceControl_type" ),
                        CimPackage.eINSTANCE.getEndDeviceControl_Reason(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceGroupsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_EndDeviceGroups_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_EndDeviceGroups_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_EndDeviceGroups(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Control Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceControlTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_EndDeviceControlType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_EndDeviceControlType_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_EndDeviceControlType(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Usage Point Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointGroupsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_UsagePointGroups_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_UsagePointGroups_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_UsagePointGroups(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Action feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceActionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EndDeviceControl_EndDeviceAction_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_EndDeviceAction_feature",
                        "_UI_EndDeviceControl_type" ),
                CimPackage.eINSTANCE.getEndDeviceControl_EndDeviceAction(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Devices feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDevicesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EndDeviceControl_EndDevices_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_EndDevices_feature",
                                "_UI_EndDeviceControl_type" ),
                        CimPackage.eINSTANCE.getEndDeviceControl_EndDevices(), true, false, true, null, null, null ) );
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
                        getResourceLocator(), getString( "_UI_EndDeviceControl_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EndDeviceControl_UsagePoints_feature",
                                "_UI_EndDeviceControl_type" ),
                        CimPackage.eINSTANCE.getEndDeviceControl_UsagePoints(), true, false, true, null, null, null ) );
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
            childrenFeatures.add( CimPackage.eINSTANCE.getEndDeviceControl_PriceSignal() );
            childrenFeatures.add( CimPackage.eINSTANCE.getEndDeviceControl_PrimaryDeviceTiming() );
            childrenFeatures.add( CimPackage.eINSTANCE.getEndDeviceControl_ScheduledInterval() );
            childrenFeatures.add( CimPackage.eINSTANCE.getEndDeviceControl_SecondaryDeviceTiming() );
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
     * This returns EndDeviceControl.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EndDeviceControl" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EndDeviceControl ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EndDeviceControl_type" )
                : getString( "_UI_EndDeviceControl_type" ) + " " + label;
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

        switch( notification.getFeatureID( EndDeviceControl.class ) ) {
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
        case CimPackage.END_DEVICE_CONTROL__ISSUER_ID:
        case CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID:
        case CimPackage.END_DEVICE_CONTROL__REASON:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getEndDeviceControl_PriceSignal(),
                CimFactory.eINSTANCE.createFloatQuantity() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getEndDeviceControl_PrimaryDeviceTiming(),
                CimFactory.eINSTANCE.createEndDeviceTiming() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getEndDeviceControl_ScheduledInterval(),
                CimFactory.eINSTANCE.createDateTimeInterval() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getEndDeviceControl_SecondaryDeviceTiming(),
                CimFactory.eINSTANCE.createEndDeviceTiming() ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getEndDeviceControl_PrimaryDeviceTiming()
                || childFeature == CimPackage.eINSTANCE.getEndDeviceControl_SecondaryDeviceTiming();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
