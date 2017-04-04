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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;

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
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationItemProvider( AdapterFactory adapterFactory ) {
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

            addDirectionPropertyDescriptor( object );
            addGeoInfoReferencePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addIncidentPropertyDescriptor( object );
            addHazardsPropertyDescriptor( object );
            addPowerSystemResourcesPropertyDescriptor( object );
            addAssetsPropertyDescriptor( object );
            addCoordinateSystemPropertyDescriptor( object );
            addPositionPointsPropertyDescriptor( object );
            addMeasurementsPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Direction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_direction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_direction_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Direction(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Geo Info Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeoInfoReferencePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_geoInfoReference_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_geoInfoReference_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_GeoInfoReference(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_type_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Type(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Incident feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncidentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_Incident_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Incident_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Incident(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hazards feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHazardsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_Hazards_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Hazards_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Hazards(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power System Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerSystemResourcesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_PowerSystemResources_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_PowerSystemResources_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_PowerSystemResources(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Assets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_Assets_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Assets_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Assets(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Coordinate System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoordinateSystemPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_CoordinateSystem_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_CoordinateSystem_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_CoordinateSystem(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Position Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositionPointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_PositionPoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_PositionPoints_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_PositionPoints(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measurements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_Measurements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_Measurements_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_Measurements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Configuration Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Location_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Location_ConfigurationEvents_feature",
                                "_UI_Location_type" ),
                        CimPackage.eINSTANCE.getLocation_ConfigurationEvents(), true, false, true, null, null, null ) );
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
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_ElectronicAddress() );
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_MainAddress() );
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_Phone1() );
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_Phone2() );
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_SecondaryAddress() );
            childrenFeatures.add( CimPackage.eINSTANCE.getLocation_Status() );
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
     * This returns Location.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Location" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Location ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Location_type" )
                : getString( "_UI_Location_type" ) + " " + label;
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

        switch( notification.getFeatureID( Location.class ) ) {
        case CimPackage.LOCATION__DIRECTION:
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
        case CimPackage.LOCATION__TYPE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
        case CimPackage.LOCATION__MAIN_ADDRESS:
        case CimPackage.LOCATION__PHONE1:
        case CimPackage.LOCATION__PHONE2:
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
        case CimPackage.LOCATION__STATUS:
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_ElectronicAddress(),
                CimFactory.eINSTANCE.createElectronicAddress() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_MainAddress(),
                CimFactory.eINSTANCE.createStreetAddress() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_Phone1(),
                CimFactory.eINSTANCE.createTelephoneNumber() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_Phone2(),
                CimFactory.eINSTANCE.createTelephoneNumber() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_SecondaryAddress(),
                CimFactory.eINSTANCE.createStreetAddress() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getLocation_Status(),
                CimFactory.eINSTANCE.createStatus() ) );
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

        boolean qualify = childFeature == CimPackage.eINSTANCE.getLocation_MainAddress()
                || childFeature == CimPackage.eINSTANCE.getLocation_SecondaryAddress()
                || childFeature == CimPackage.eINSTANCE.getLocation_Phone1()
                || childFeature == CimPackage.eINSTANCE.getLocation_Phone2();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
