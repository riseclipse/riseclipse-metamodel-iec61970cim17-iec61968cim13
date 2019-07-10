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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovGAST3ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovGAST3ItemProvider( AdapterFactory adapterFactory ) {
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

            addBcaPropertyDescriptor( object );
            addBpPropertyDescriptor( object );
            addDtcPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKacPropertyDescriptor( object );
            addKcaPropertyDescriptor( object );
            addKsiPropertyDescriptor( object );
            addKyPropertyDescriptor( object );
            addMnefPropertyDescriptor( object );
            addMxefPropertyDescriptor( object );
            addRcmnPropertyDescriptor( object );
            addRcmxPropertyDescriptor( object );
            addTacPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTfenPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTsiPropertyDescriptor( object );
            addTtPropertyDescriptor( object );
            addTtcPropertyDescriptor( object );
            addTyPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bca feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBcaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_bca_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_bca_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Bca(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_bp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_bp_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Bp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dtc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDtcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_dtc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_dtc_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Dtc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_ka_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kac feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKacPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_kac_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_kac_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Kac(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kca feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKcaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_kca_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_kca_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Kca(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ksi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKsiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_ksi_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_ksi_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Ksi(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ky feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_ky_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_ky_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Ky(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mnef feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMnefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_mnef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_mnef_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Mnef(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mxef feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMxefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_mxef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_mxef_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Mxef(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rcmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRcmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_rcmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_rcmn_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Rcmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rcmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRcmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_rcmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_rcmx_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Rcmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tac feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTacPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tac_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tac_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tac(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tc_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_td_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Td(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tfen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tfen_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tfen_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tfen(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tg_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tsi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tsi_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tsi_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tsi(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_tt_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ttc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTtcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_ttc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_ttc_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Ttc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ty feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST3_ty_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST3_ty_feature",
                                "_UI_GovGAST3_type" ),
                        CimPackage.eINSTANCE.getGovGAST3_Ty(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovGAST3.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovGAST3" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovGAST3 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovGAST3_type" )
                : getString( "_UI_GovGAST3_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovGAST3.class ) ) {
        case CimPackage.GOV_GAST3__BCA:
        case CimPackage.GOV_GAST3__BP:
        case CimPackage.GOV_GAST3__DTC:
        case CimPackage.GOV_GAST3__KA:
        case CimPackage.GOV_GAST3__KAC:
        case CimPackage.GOV_GAST3__KCA:
        case CimPackage.GOV_GAST3__KSI:
        case CimPackage.GOV_GAST3__KY:
        case CimPackage.GOV_GAST3__MNEF:
        case CimPackage.GOV_GAST3__MXEF:
        case CimPackage.GOV_GAST3__RCMN:
        case CimPackage.GOV_GAST3__RCMX:
        case CimPackage.GOV_GAST3__TAC:
        case CimPackage.GOV_GAST3__TC:
        case CimPackage.GOV_GAST3__TD:
        case CimPackage.GOV_GAST3__TFEN:
        case CimPackage.GOV_GAST3__TG:
        case CimPackage.GOV_GAST3__TSI:
        case CimPackage.GOV_GAST3__TT:
        case CimPackage.GOV_GAST3__TTC:
        case CimPackage.GOV_GAST3__TY:
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
