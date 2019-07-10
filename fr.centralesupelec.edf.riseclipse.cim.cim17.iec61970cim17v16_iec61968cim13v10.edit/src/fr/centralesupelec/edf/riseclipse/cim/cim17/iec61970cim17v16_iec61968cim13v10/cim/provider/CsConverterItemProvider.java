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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CsConverterItemProvider extends ACDCConverterItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CsConverterItemProvider( AdapterFactory adapterFactory ) {
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

            addAlphaPropertyDescriptor( object );
            addGammaPropertyDescriptor( object );
            addMaxAlphaPropertyDescriptor( object );
            addMaxGammaPropertyDescriptor( object );
            addMaxIdcPropertyDescriptor( object );
            addMinAlphaPropertyDescriptor( object );
            addMinGammaPropertyDescriptor( object );
            addMinIdcPropertyDescriptor( object );
            addOperatingModePropertyDescriptor( object );
            addPPccControlPropertyDescriptor( object );
            addRatedIdcPropertyDescriptor( object );
            addTargetAlphaPropertyDescriptor( object );
            addTargetGammaPropertyDescriptor( object );
            addTargetIdcPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Alpha feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlphaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_alpha_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_alpha_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_Alpha(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gamma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGammaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_gamma_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_gamma_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_Gamma(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Alpha feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxAlphaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_maxAlpha_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_maxAlpha_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MaxAlpha(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Gamma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxGammaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_maxGamma_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_maxGamma_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MaxGamma(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Idc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxIdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_maxIdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_maxIdc_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MaxIdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Alpha feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinAlphaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_minAlpha_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_minAlpha_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MinAlpha(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Gamma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinGammaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_minGamma_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_minGamma_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MinGamma(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Idc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinIdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_minIdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_minIdc_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_MinIdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operating Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperatingModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_operatingMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_operatingMode_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_OperatingMode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PPcc Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPccControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_pPccControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_pPccControl_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_PPccControl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Idc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedIdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_ratedIdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_ratedIdc_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_RatedIdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Alpha feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetAlphaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_targetAlpha_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_targetAlpha_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_TargetAlpha(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Gamma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetGammaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_targetGamma_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_targetGamma_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_TargetGamma(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Idc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetIdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CsConverter_targetIdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CsConverter_targetIdc_feature",
                                "_UI_CsConverter_type" ),
                        CimPackage.eINSTANCE.getCsConverter_TargetIdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns CsConverter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CsConverter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CsConverter ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_CsConverter_type" )
                : getString( "_UI_CsConverter_type" ) + " " + label;
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

        switch( notification.getFeatureID( CsConverter.class ) ) {
        case CimPackage.CS_CONVERTER__ALPHA:
        case CimPackage.CS_CONVERTER__GAMMA:
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
        case CimPackage.CS_CONVERTER__MAX_IDC:
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
        case CimPackage.CS_CONVERTER__MIN_IDC:
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
        case CimPackage.CS_CONVERTER__RATED_IDC:
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
        case CimPackage.CS_CONVERTER__TARGET_IDC:
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
