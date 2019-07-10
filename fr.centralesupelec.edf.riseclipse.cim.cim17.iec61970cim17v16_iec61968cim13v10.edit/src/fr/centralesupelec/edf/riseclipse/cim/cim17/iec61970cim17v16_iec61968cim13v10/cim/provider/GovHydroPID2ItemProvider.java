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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPID2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPID2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroPID2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroPID2ItemProvider( AdapterFactory adapterFactory ) {
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

            addAtwPropertyDescriptor( object );
            addDPropertyDescriptor( object );
            addFeedbackSignalPropertyDescriptor( object );
            addG0PropertyDescriptor( object );
            addG1PropertyDescriptor( object );
            addG2PropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addP1PropertyDescriptor( object );
            addP2PropertyDescriptor( object );
            addP3PropertyDescriptor( object );
            addRpermPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTregPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addVelmaxPropertyDescriptor( object );
            addVelminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Atw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAtwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_atw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_atw_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Atw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the D feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_d_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_d_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_D(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Feedback Signal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedbackSignalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_feedbackSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_feedbackSignal_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_FeedbackSignal(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_g0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_g0_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_G0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_g1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_g1_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_G1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_g2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_g2_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_G2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_gmax_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Gmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_gmin_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Gmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_kd_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Kd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_ki_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_kp_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Kp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroPID2_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_mwbase_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_p1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_p1_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_P1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_p2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_p2_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_P2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_p3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_p3_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_P3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rperm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRpermPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_rperm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_rperm_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Rperm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_ta_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_tb_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Treg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTregPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_treg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_treg_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Treg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_tw_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Tw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_velmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_velmax_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Velmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroPID2_velmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID2_velmin_feature",
                                "_UI_GovHydroPID2_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID2_Velmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydroPID2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroPID2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroPID2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroPID2_type" )
                : getString( "_UI_GovHydroPID2_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroPID2.class ) ) {
        case CimPackage.GOV_HYDRO_PID2__ATW:
        case CimPackage.GOV_HYDRO_PID2__D:
        case CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL:
        case CimPackage.GOV_HYDRO_PID2__G0:
        case CimPackage.GOV_HYDRO_PID2__G1:
        case CimPackage.GOV_HYDRO_PID2__G2:
        case CimPackage.GOV_HYDRO_PID2__GMAX:
        case CimPackage.GOV_HYDRO_PID2__GMIN:
        case CimPackage.GOV_HYDRO_PID2__KD:
        case CimPackage.GOV_HYDRO_PID2__KI:
        case CimPackage.GOV_HYDRO_PID2__KP:
        case CimPackage.GOV_HYDRO_PID2__MWBASE:
        case CimPackage.GOV_HYDRO_PID2__P1:
        case CimPackage.GOV_HYDRO_PID2__P2:
        case CimPackage.GOV_HYDRO_PID2__P3:
        case CimPackage.GOV_HYDRO_PID2__RPERM:
        case CimPackage.GOV_HYDRO_PID2__TA:
        case CimPackage.GOV_HYDRO_PID2__TB:
        case CimPackage.GOV_HYDRO_PID2__TREG:
        case CimPackage.GOV_HYDRO_PID2__TW:
        case CimPackage.GOV_HYDRO_PID2__VELMAX:
        case CimPackage.GOV_HYDRO_PID2__VELMIN:
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
