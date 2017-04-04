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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerSystemResourceItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerSystemResourceItemProvider( AdapterFactory adapterFactory ) {
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

            addControlsPropertyDescriptor( object );
            addAssetDatasheetPropertyDescriptor( object );
            addReportingGroupPropertyDescriptor( object );
            addAssetsPropertyDescriptor( object );
            addOperationalTagsPropertyDescriptor( object );
            addOperatingSharePropertyDescriptor( object );
            addClearancesPropertyDescriptor( object );
            addLocationPropertyDescriptor( object );
            addPSRTypePropertyDescriptor( object );
            addMeasurementsPropertyDescriptor( object );
            addPSREventsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Controls feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerSystemResource_Controls_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_Controls_feature",
                                "_UI_PowerSystemResource_type" ),
                        CimPackage.eINSTANCE.getPowerSystemResource_Controls(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Datasheet feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetDatasheetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_AssetDatasheet_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_AssetDatasheet_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_AssetDatasheet(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reporting Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReportingGroupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_ReportingGroup_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_ReportingGroup_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_ReportingGroup(), true, false, true, null, null, null ) );
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
                        getResourceLocator(), getString( "_UI_PowerSystemResource_Assets_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_Assets_feature",
                                "_UI_PowerSystemResource_type" ),
                        CimPackage.eINSTANCE.getPowerSystemResource_Assets(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operational Tags feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalTagsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_OperationalTags_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_OperationalTags_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_OperationalTags(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operating Share feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperatingSharePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_OperatingShare_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_OperatingShare_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_OperatingShare(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Clearances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClearancesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_Clearances_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_Clearances_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_Clearances(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerSystemResource_Location_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_Location_feature",
                                "_UI_PowerSystemResource_type" ),
                        CimPackage.eINSTANCE.getPowerSystemResource_Location(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PSR Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPSRTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerSystemResource_PSRType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_PSRType_feature",
                                "_UI_PowerSystemResource_type" ),
                        CimPackage.eINSTANCE.getPowerSystemResource_PSRType(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measurements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_Measurements_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_Measurements_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_Measurements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PSR Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPSREventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerSystemResource_PSREvents_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerSystemResource_PSREvents_feature",
                        "_UI_PowerSystemResource_type" ),
                CimPackage.eINSTANCE.getPowerSystemResource_PSREvents(), true, false, true, null, null, null ) );
    }

    /**
     * This returns PowerSystemResource.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerSystemResource" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerSystemResource ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerSystemResource_type" )
                : getString( "_UI_PowerSystemResource_type" ) + " " + label;
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
