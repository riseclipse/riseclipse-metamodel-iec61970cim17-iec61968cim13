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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WireInfoItemProvider extends AssetInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WireInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addCoreRadiusPropertyDescriptor( object );
            addCoreStrandCountPropertyDescriptor( object );
            addGmrPropertyDescriptor( object );
            addInsulatedPropertyDescriptor( object );
            addInsulationMaterialPropertyDescriptor( object );
            addInsulationThicknessPropertyDescriptor( object );
            addMaterialPropertyDescriptor( object );
            addRAC25PropertyDescriptor( object );
            addRAC50PropertyDescriptor( object );
            addRAC75PropertyDescriptor( object );
            addRadiusPropertyDescriptor( object );
            addRatedCurrentPropertyDescriptor( object );
            addRDC20PropertyDescriptor( object );
            addSizeDescriptionPropertyDescriptor( object );
            addStrandCountPropertyDescriptor( object );
            addWirePhaseInfoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Core Radius feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreRadiusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_coreRadius_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_coreRadius_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_CoreRadius(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core Strand Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreStrandCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_coreStrandCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_coreStrandCount_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_CoreStrandCount(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_gmr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_gmr_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_Gmr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Insulated feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInsulatedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_insulated_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_insulated_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_Insulated(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Insulation Material feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInsulationMaterialPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_insulationMaterial_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_insulationMaterial_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_InsulationMaterial(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Insulation Thickness feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInsulationThicknessPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_insulationThickness_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_insulationThickness_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_InsulationThickness(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Material feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaterialPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_material_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_material_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_Material(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the RAC25 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRAC25PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_rAC25_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_rAC25_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_RAC25(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the RAC50 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRAC50PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_rAC50_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_rAC50_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_RAC50(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the RAC75 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRAC75PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_rAC75_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_rAC75_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_RAC75(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Radius feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRadiusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_radius_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_radius_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_Radius(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_ratedCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_ratedCurrent_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_RatedCurrent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the RDC20 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRDC20PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_rDC20_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_rDC20_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_RDC20(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Size Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizeDescriptionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_sizeDescription_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_sizeDescription_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_SizeDescription(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Strand Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStrandCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_strandCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_strandCount_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_StrandCount(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wire Phase Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWirePhaseInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WireInfo_WirePhaseInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WireInfo_WirePhaseInfo_feature",
                                "_UI_WireInfo_type" ),
                        CimPackage.eINSTANCE.getWireInfo_WirePhaseInfo(), true, false, true, null, null, null ) );
    }

    /**
     * This returns WireInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WireInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WireInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WireInfo_type" )
                : getString( "_UI_WireInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( WireInfo.class ) ) {
        case CimPackage.WIRE_INFO__CORE_RADIUS:
        case CimPackage.WIRE_INFO__CORE_STRAND_COUNT:
        case CimPackage.WIRE_INFO__GMR:
        case CimPackage.WIRE_INFO__INSULATED:
        case CimPackage.WIRE_INFO__INSULATION_MATERIAL:
        case CimPackage.WIRE_INFO__INSULATION_THICKNESS:
        case CimPackage.WIRE_INFO__MATERIAL:
        case CimPackage.WIRE_INFO__RAC25:
        case CimPackage.WIRE_INFO__RAC50:
        case CimPackage.WIRE_INFO__RAC75:
        case CimPackage.WIRE_INFO__RADIUS:
        case CimPackage.WIRE_INFO__RATED_CURRENT:
        case CimPackage.WIRE_INFO__RDC20:
        case CimPackage.WIRE_INFO__SIZE_DESCRIPTION:
        case CimPackage.WIRE_INFO__STRAND_COUNT:
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
