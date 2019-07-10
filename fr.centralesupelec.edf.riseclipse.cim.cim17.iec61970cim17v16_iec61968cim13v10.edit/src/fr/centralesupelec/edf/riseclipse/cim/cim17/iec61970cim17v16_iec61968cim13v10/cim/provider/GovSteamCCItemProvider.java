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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamCC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamCCItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamCCItemProvider( AdapterFactory adapterFactory ) {
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

            addDhpPropertyDescriptor( object );
            addDlpPropertyDescriptor( object );
            addFhpPropertyDescriptor( object );
            addFlpPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPmaxhpPropertyDescriptor( object );
            addPmaxlpPropertyDescriptor( object );
            addRhpPropertyDescriptor( object );
            addRlpPropertyDescriptor( object );
            addT1hpPropertyDescriptor( object );
            addT1lpPropertyDescriptor( object );
            addT3hpPropertyDescriptor( object );
            addT3lpPropertyDescriptor( object );
            addT4hpPropertyDescriptor( object );
            addT4lpPropertyDescriptor( object );
            addT5hpPropertyDescriptor( object );
            addT5lpPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dhp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_dhp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_dhp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Dhp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dlp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_dlp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_dlp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Dlp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fhp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_fhp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_fhp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Fhp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_flp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_flp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Flp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_mwbase_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmaxhp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_pmaxhp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_pmaxhp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Pmaxhp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmaxlp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_pmaxlp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_pmaxlp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Pmaxlp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rhp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_rhp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_rhp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Rhp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rlp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_rlp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_rlp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_Rlp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1hp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1hpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t1hp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t1hp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T1hp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1lp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1lpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t1lp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t1lp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T1lp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3hp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3hpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t3hp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t3hp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T3hp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3lp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3lpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t3lp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t3lp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T3lp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4hp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4hpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t4hp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t4hp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T4hp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4lp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4lpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t4lp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t4lp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T4lp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T5hp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5hpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t5hp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t5hp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T5hp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T5lp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5lpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamCC_t5lp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamCC_t5lp_feature",
                                "_UI_GovSteamCC_type" ),
                        CimPackage.eINSTANCE.getGovSteamCC_T5lp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovSteamCC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamCC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamCC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamCC_type" )
                : getString( "_UI_GovSteamCC_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamCC.class ) ) {
        case CimPackage.GOV_STEAM_CC__DHP:
        case CimPackage.GOV_STEAM_CC__DLP:
        case CimPackage.GOV_STEAM_CC__FHP:
        case CimPackage.GOV_STEAM_CC__FLP:
        case CimPackage.GOV_STEAM_CC__MWBASE:
        case CimPackage.GOV_STEAM_CC__PMAXHP:
        case CimPackage.GOV_STEAM_CC__PMAXLP:
        case CimPackage.GOV_STEAM_CC__RHP:
        case CimPackage.GOV_STEAM_CC__RLP:
        case CimPackage.GOV_STEAM_CC__T1HP:
        case CimPackage.GOV_STEAM_CC__T1LP:
        case CimPackage.GOV_STEAM_CC__T3HP:
        case CimPackage.GOV_STEAM_CC__T3LP:
        case CimPackage.GOV_STEAM_CC__T4HP:
        case CimPackage.GOV_STEAM_CC__T4LP:
        case CimPackage.GOV_STEAM_CC__T5HP:
        case CimPackage.GOV_STEAM_CC__T5LP:
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
