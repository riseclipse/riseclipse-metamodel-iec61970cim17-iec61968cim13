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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CableInfoItemProvider extends WireInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CableInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addConstructionKindPropertyDescriptor( object );
            addDiameterOverCorePropertyDescriptor( object );
            addDiameterOverInsulationPropertyDescriptor( object );
            addDiameterOverJacketPropertyDescriptor( object );
            addDiameterOverScreenPropertyDescriptor( object );
            addIsStrandFillPropertyDescriptor( object );
            addNominalTemperaturePropertyDescriptor( object );
            addOuterJacketKindPropertyDescriptor( object );
            addSheathAsNeutralPropertyDescriptor( object );
            addShieldMaterialPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Construction Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConstructionKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_constructionKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_constructionKind_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_ConstructionKind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Diameter Over Core feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiameterOverCorePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_diameterOverCore_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_diameterOverCore_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_DiameterOverCore(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Diameter Over Insulation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiameterOverInsulationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_diameterOverInsulation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_diameterOverInsulation_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_DiameterOverInsulation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Diameter Over Jacket feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiameterOverJacketPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_diameterOverJacket_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_diameterOverJacket_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_DiameterOverJacket(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Diameter Over Screen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiameterOverScreenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_diameterOverScreen_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_diameterOverScreen_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_DiameterOverScreen(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Strand Fill feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsStrandFillPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_isStrandFill_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_isStrandFill_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_IsStrandFill(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Temperature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalTemperaturePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_nominalTemperature_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_nominalTemperature_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_NominalTemperature(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Outer Jacket Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOuterJacketKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_outerJacketKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_outerJacketKind_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_OuterJacketKind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sheath As Neutral feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSheathAsNeutralPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_sheathAsNeutral_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_sheathAsNeutral_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_SheathAsNeutral(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Shield Material feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShieldMaterialPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CableInfo_shieldMaterial_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CableInfo_shieldMaterial_feature",
                                "_UI_CableInfo_type" ),
                        CimPackage.eINSTANCE.getCableInfo_ShieldMaterial(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns CableInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CableInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CableInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_CableInfo_type" )
                : getString( "_UI_CableInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( CableInfo.class ) ) {
        case CimPackage.CABLE_INFO__CONSTRUCTION_KIND:
        case CimPackage.CABLE_INFO__DIAMETER_OVER_CORE:
        case CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
        case CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
        case CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
        case CimPackage.CABLE_INFO__IS_STRAND_FILL:
        case CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
        case CimPackage.CABLE_INFO__OUTER_JACKET_KIND:
        case CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
        case CimPackage.CABLE_INFO__SHIELD_MATERIAL:
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
